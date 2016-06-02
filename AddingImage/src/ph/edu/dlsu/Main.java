package ph.edu.dlsu;


import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Main extends GraphicsProgram {
    // Citation constants
    private static final String CAPTION_FONT = "SansSerif-10";
    private static final int CAPTION_MARGIN = 30;
    // dimensions of window
    public static final int APPLICATION_WIDTH = 1920;
    public static final int APPLICATION_HEIGHT = 1170 +
            CAPTION_MARGIN;
    // horizontal offset
    public static final int X_OFFSET = 50;

    public void run() {
        add(new GImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\linuxpenguin.jpg"));
        addCaption("Melvin Cabatuan, Osaka 2009");
    }

    // Adds caption along bottom of window
    private void addCaption(String text) {
        GLabel label = new GLabel(text);
        label.setFont(CAPTION_FONT);
        label.setColor(Color.WHITE);
        double y = getHeight() - CAPTION_MARGIN +
                label.getAscent();
        add(label, getXCenter(label) + X_OFFSET, y);
    }

    private double getXCenter(GObject g) {
        return (getWidth() - g.getWidth()) / 2;
    }

    public static void main(String[] args) {
        new Main().start(args);
    }
}