package io.th0rgal.drawing;

import io.th0rgal.drawing.sketches.Exo3;
import io.th0rgal.drawing.sketches.Exo4;
import processing.core.PApplet;

public class Core {


    public static void main(String[] args) {
        String[] processingArgs = {"TestSketch"};
        PApplet.runSketch(processingArgs, new Exo4());
    }

}
