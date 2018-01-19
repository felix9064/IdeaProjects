package com.felix.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/6.
 * Autowired注解实现自动装配，即当Spring创建bean时会传入一个可设置给CompactDisc类型的bean
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    /*
    @Autowired(required = false)
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }
    */

    @Override
    public void play() {
        cd.play();
    }
}
