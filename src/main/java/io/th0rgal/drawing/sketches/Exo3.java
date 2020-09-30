package io.th0rgal.drawing.sketches;

import processing.core.PApplet;

public class Exo3 extends PApplet {

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        noLoop();
    }

    public void mouseMoved() {
        redraw();
    }

    public void mousePressed() {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse released");
    }


    public void draw() {
        background(0, 0, 255);
        stroke(255, 255, 255);
        strokeWeight(75);
        line(0, 0, width, height);
        line(0, height, width, 0);
        stroke(255, 0, 0);
        strokeWeight(50);
        line(0, 0, width, height);
        line(0, height, width, 0);

        stroke(255, 255, 255);
        strokeWeight(75);
        line(width / 2f, 0, width / 2f, height);
        line(0, height / 2f, width, height / 2f);
        stroke(255, 0, 0);
        strokeWeight(50);
        line(width / 2f, 0, width / 2f, height);
        line(0, height / 2f, width, height / 2f);

    }

}