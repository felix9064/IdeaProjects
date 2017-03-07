package com.felix.demo.modifyscript;

import java.io.File;
import java.time.LocalTime;

/**
 * Created by Felix on 2016/7/19.
 */
public class ModifyScriptFile {

    public static void dealScriptFile(String olddir, String newdir) {
        File filedir = new File(olddir);
        File[] files = filedir.listFiles();

        File dir = new File(newdir);
        if(!dir.exists()){
            dir.mkdir();
        }


        for(File f : files) {

        }

    }

    public static void main(String args[]) {
        String dir = "G:\\Sunline\\JRCBank\\CLDevelopmentCode\\front\\workspace\\jiangyin\\trans\\script\\";
        String newDir = "G:\\Sunline\\JRCBank\\scriptnew\\";

        LocalTime now = LocalTime.now();
        int start = now.toSecondOfDay();
        System.out.println("修改script文件开始时间：" + now.toString());

        // dealShowFile(dir, newDir);

        now = LocalTime.now();
        int end = now.toSecondOfDay();
        System.out.println("修改script文件结束时间：" + now.toString());

        System.out.println("修改script文件所耗时间：" + (end - start) + " 秒");

    }
}
