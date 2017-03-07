package com.felix.demo.parsexml;

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
import java.util.Iterator;
import java.util.List;

/**
 * Created by Felix on 2016/5/14.
 */
public class ModifyShowFile {
    /**
     * 修改show目录下所有的show文件
     * @param dir 修改前show文件所在的目录
     * @param newDir 生成新的show文件所在的目录
     */
    public static void dealShowFile(String dir, String newDir) {

        File filedir = new File(dir);
        File[] files = filedir.listFiles();

        File newdir = new File(newDir);
        if(!newdir.exists()){
            newdir.mkdir();
        }


        for (File f : files) {
            if (!f.isDirectory()) {
                Document doc = parseShowFile(f.getAbsolutePath());
                if(doc != null){
                    writeShowFile(doc, newDir);
                }
            }
        }
    }

    /**
     * 解析show文件，并修改某个节点的某个属性值
     * @param fileName show文件所在路径
     * @return 解析show文件得到的Document对象
     */
    public static Document parseShowFile(String fileName) {
        File show = new File(fileName);
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(show);
            Element element = document.getRootElement();
            if("Window".equals(element.getName())) {
                /*
                Attribute attr = element.attribute("width");
                String width = attr.getText();
                if (!"780".equals(width)) {
                    attr.setText("780");
                    return document;
                }*/

                // 获取Widget节点
                Element widgets = element.element("Widgets");

                // 当前页面中是否有ComboBox节点含有onFocusLost属性
                boolean hasOnFocusLost = false;

                // 获取Widgets节点下面的所有的 ComboBox 节点
                List<Element> comboBox = widgets.elements("ComboBox");

                // 遍历所有的ComboBox
                Iterator it = comboBox.iterator();

                while (it.hasNext()) {
                    // 获取当前的ComboBox
                    Element e = (Element) it.next();

                    // 看当前的ComboBox节点是否有onFocusLost属性
                    Attribute attr = e.attribute("onFocusLost");
                    if(attr != null) {
                        // 如果当前ComboBox控件有onFocusLost属性，则将其属性值保存起来
                        String funcName = attr.getText();

                        // 移除onFocusLost属性
                        e.remove(attr);

                        // 增加onSelectOut属性，其属性值为之前保存的值
                        e.addAttribute("onSelectOut" , funcName);

                        hasOnFocusLost = true;
                    }

                    /*
                    // 看当前的ComboBox节点是否有parmKey属性
                    Attribute parmKey = e.attribute("parmKey");

                    // 如果当前comboBox控件的parmKey属性值为空或者是NULL的话，就去掉该属性
                    if(parmKey != null && ("NULL".equals(parmKey.getText()) || "null".equals(parmKey.getText()))) {
                        e.remove(parmKey);
                        hasOnFocusLost = true;
                    }
                    */
                }

                // 如果当前页面已被修改
                if(hasOnFocusLost) {
                    return document;
                } else {
                    return null;
                }
            }

            return null;
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将修改后的Document对象写入新的文件
     * @param document 修改后的document对象
     * @param newFilePath 将要写入的文件路径
     */
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
        // String dir = "G:\\Sunline\\JRCBank\\showold\\";
        String newDir = "G:\\Sunline\\JRCBank\\shownew\\";

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
