package io.th0rgal.drawing;

import io.th0rgal.drawing.sketches.Exo1;
import processing.core.PApplet;

public class Core {


    public static void main(String[] args) {
        String[] processingArgs = {"TestSketch"};
        Exo1 mySketch = new Exo1();
        PApplet.runSketch(processingArgs, mySketch);
    }

}
