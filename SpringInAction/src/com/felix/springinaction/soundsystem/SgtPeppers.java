package com.felix.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/6.
 * Component注解为自动装配时使用的，表示此类是一个组件类，括号中的参数为该组件的ID，需要Spring为这个类创建bean
 */
@Component("lonelyHeartClub1")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Peppers's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
