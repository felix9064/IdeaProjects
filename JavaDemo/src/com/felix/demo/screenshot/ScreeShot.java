package com.felix.demo.screenshot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Felix on 2016/6/28.
 * 截全屏并显示
 */
public class ScreeShot {

    public static void main(String[] args) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        try {
            Robot robot = new Robot();
            BufferedImage screenshot = robot.createScreenCapture(new Rectangle(0,
                    0,(int)dimension.getWidth(),(int)dimension.getHeight()));

            String savePath = "C:/Users/zhang/Desktop/";
            File dir = new File(savePath);
            if(!dir.exists()){
                dir.mkdir();
            }

            //保存为文件
            LocalTime now = LocalTime.now();
            String saveFile = savePath + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE) + ".jpg";
            File file = new File(saveFile);
            ImageIO.write(screenshot, "jpg", file);

            //使用windows图片查看器打开
            saveFile = saveFile.replaceAll("/", "\\\\");
            Runtime.getRuntime().exec("rundll32 C:\\Windows\\System32\\shimgvw.dll,ImageView_Fullscreen " + saveFile);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
