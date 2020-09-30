package io.th0rgal.drawing.sketches;

import processing.core.PApplet;

public class Test extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void draw() {
        ellipse(mouseX, mouseY, 50, 50);
    }

    public void mousePressed() {
        background(64);
    }

}