package io.th0rgal.drawing.sketches;

import processing.core.PApplet;

public class Exo2 extends PApplet {

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        noLoop();
    }

    public void draw() {
        background(255, 150, 0);
        stroke(0, 0, 0);
        strokeWeight(5);
        line(0, 0, width, height);
        line(0, height, width, 0);
        stroke(0, 255, 0);
        strokeWeight(10);
        line(width / 2f, 0, width / 2f, height);
        line(0, height / 2f, width, height / 2f);
        rect(10, 20, 30, 40);
    }

}