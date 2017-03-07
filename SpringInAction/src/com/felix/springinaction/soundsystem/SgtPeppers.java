package com.felix.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Felix on 2017/3/6.
 */

@Component("lonelyHeartClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Peppers's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
