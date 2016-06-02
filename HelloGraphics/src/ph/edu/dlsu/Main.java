package ph.edu.dlsu;


import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.program.*;

import java.awt.*;

public class Main extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {
        GLabel myLabel = new GLabel("Hello ACM Graphics");
        myLabel.setFont("Serif-bold-36");
        myLabel.setColor(Color.RED);
        add(myLabel, getXCenter(myLabel),
                getYCenter(myLabel));
        setBackground(Color.GREEN);
    }

    private double getXCenter(GObject g) {
        return (getWidth() - g.getWidth()) / 2;
    }

    private double getYCenter(GObject g) {
        return (getHeight() - g.getHeight()) / 2;
    }


    public static void main(String[] args) {
        new Main().start(args);
    }
}