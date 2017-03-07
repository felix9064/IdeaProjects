package com.felix.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by Felix on 2017/3/2.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }


}
