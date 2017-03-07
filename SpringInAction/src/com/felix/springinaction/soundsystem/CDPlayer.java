package com.felix.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Felix on 2017/3/6.
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
