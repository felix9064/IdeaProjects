package com.felix;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalTime;

/**
 * Created by Felix on 2016/5/14.
 */
public class ModifyShowFile {
    /**
     * 修改show目录下所有的show文件中Window节点的width属性的值为780
     * @param dir 修改前show文件所在的目录
     * @param newDir 生成新的show文件所在的目录
     */
    public static void dealShowFile(String dir, String newDir) {

        File filedir = new File(dir);
        File[] files = filedir.listFiles();

        for (File f : files) {
            if (!f.isDirectory()) {
                Document doc = parseShowFile(f.getAbsolutePath());
                if(doc != null){
                    writeShowFile(doc, newDir);
                }
            }
        }
    }

    public static Document parseShowFile(String fileName) {
        File show = new File(fileName);
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(show);
            Element element = document.getRootElement();
            if("Window".equals(element.getName())) {
                Attribute attr = element.attribute("width");
                String width = attr.getText();
                if (!"780".equals(width)) {
                    attr.setText("780");
                    return document;
                }
            }
            return null;
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeShowFile(Document document, String newFilePath) {
        // 获得文件名
        String name = document.getRootElement().attribute("name").getText();
        String newName = newFilePath + name + ".show";

        // 创建文件输出的时候，自动缩进的格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");

        try {
            Writer writer = new FileWriter(newName);
            XMLWriter xmlWriter = new XMLWriter(writer, format);
            xmlWriter.write(document);
            xmlWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        String dir = "G:\\Sunline\\JRCBank\\CLDevelopmentCode\\front\\workspace\\jiangyin\\trans\\show\\";
        String newDir = "G:\\Sunline\\JRCBank\\CLDevelopmentCode\\front\\workspace\\jiangyin\\trans\\shownew\\";

        LocalTime now = LocalTime.now();
        int start = now.toSecondOfDay();
        System.out.println("修改show文件开始时间：" + now.toString());

        dealShowFile(dir, newDir);

        now = LocalTime.now();
        int end = now.toSecondOfDay();
        System.out.println("修改show文件结束时间：" + now.toString());

        System.out.println("修改show文件所耗时间：" + (end - start) + " 秒");

    }
}
