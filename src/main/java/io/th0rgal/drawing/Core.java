package io.th0rgal.drawing;

import io.th0rgal.drawing.sketches.Test;
import processing.core.PApplet;

public class Core {


    public static void main(String[] args) {
        String[] processingArgs = {"TestSketch"};
        Test mySketch = new Test();
        PApplet.runSketch(processingArgs, mySketch);
    }

}
