package com.smartphone;

public class TouchPhone extends keypadphone{
    @Override
    public void click() {
        System.out.println("photo is click ");
    }

    @Override
    public void play() {
        System.out.println("song is running");

    }

    @Override
    public void stop() {
        System.out.println("vedio is stop");

    }



    @Override
    public void record() {
        System.out.println("call is recorded");

    }

}
