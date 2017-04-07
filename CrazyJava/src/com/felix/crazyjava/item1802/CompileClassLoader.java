package com.felix.crazyjava.item1802;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description: 自定义类加载器，可以编译并运行指定java文件，本例中加载Hello.class
 * Author: Felix
 * Date: 2017/4/1
 * Time: 14:06
 */
public class CompileClassLoader extends ClassLoader {

    private byte[] getBytes(String name) throws IOException {
        File file = new File(name);
        long len = file.length();

        byte[] raw = new byte[(int) len];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int r = fileInputStream.read(raw);
            if (r != len) {
                throw new IOException("无法读取全部文件" + r + " != " + len);
            }
            return raw;
        }
    }

    private boolean compile(String javaFile) throws IOException {
        System.out.println("CompileClassLoader：正在编译" + javaFile + "...");
        Process process = Runtime.getRuntime().exec("javac " + javaFile);

        try {
            process.waitFor();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        int ret = process.exitValue();
        return ret == 0;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("要运行的文件：" + name);
        Class clazz = null;
        String fileStub = name.replace(".", "/");

        String javaFilename = fileStub + ".java";
        String classFilename = fileStub + ".class";

        File javaFile = new File(javaFilename);
        File classFile =  new File(classFilename);

        if (javaFile.exists() && (!classFile.exists() ||
                javaFile.lastModified() > classFile.lastModified())) {
            try {
                if (!compile(javaFilename) || !classFile.exists()) {
                    throw new ClassNotFoundException("ClassNotFoundException:" + javaFilename);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (classFile.exists()) {
            try {
                byte[] raw = getBytes(classFilename);
                clazz = defineClass(name, raw, 0, raw.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (clazz == null) {
            throw new ClassNotFoundException(name);
        }
        return clazz;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("参数长度：" + args.length);

        if (args.length < 1) {
            System.out.println("缺少目标类，请按如下格式运行源文件");
            System.out.println("java CompileClassLoader ClassName");
        }

        // 要运行的类名
        String progClass = args[0];
        // 给要运行的类传的参数列表
        String[] progArgs = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);

        CompileClassLoader ccl = new CompileClassLoader();
        Class<?> clazz = ccl.loadClass(progClass);
        Method method = clazz.getMethod("main", (new String [0]).getClass());
        Object argsArray[] = {progArgs};
        method.invoke(null, argsArray);
    }
}
