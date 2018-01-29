package com.atv.main;

import com.atv.display.Display;

import java.awt.*;

/**
 * Created by DELL on 6/5/2017.
 */
public class Main {
    public static void main(String[] args) {
        Display.create(500,500,"Tanks");

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        System.out.println( (width/2-250) + " " + (height/2-250));
    }
}
