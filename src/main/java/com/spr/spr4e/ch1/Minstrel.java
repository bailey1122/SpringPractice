package com.spr.spr4e.ch1;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("fa la la ");
    }

    public void singAfterQuest() {
        stream.println("te hee hee");
    }
}
