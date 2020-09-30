package io.th0rgal.drawing.sketches;

import processing.core.PApplet;

public class Exo4 extends PApplet {

    public void setup() {
        surface.setResizable(true);
    }

    public void settings() {
        size(500, 500);
    }

    void frogFace(int xA, int yA, int xB, int yB) {


        int dx = xA - xB;
        int dy = yA - yB;
        float doubleRadius = sqrt(dx * dx + dy * dy);

        noStroke();
        fill(0, 255, 0);
        ellipse((xA + xB) / 2f, (yA + yB) / 2f, doubleRadius, doubleRadius);

        fill(255, 0, 0);
        beginShape();
        vertex(xA, yA);
        vertex((xA - dx / 4f), (yA - dy / 4f));
        vertex((xA - dx / 2f) + dy / 6f, (yA - dy / 2f) - dx / 6f);
        vertex((xA - 3 * dx / 4f), (yA - 3 * dy / 4f));
        vertex(xB, yB);
        vertex((xA - 3 * dx / 4f) - dy / 10f, (yA - 3 * dy / 4f) + dx / 10f);
        vertex((xA - dx / 2f), (yA - dy / 2f));
        vertex((xA - dx / 4f) - dy / 10f, (yA - dy / 4f) + dx / 10f);
        endShape();

        int xC = xA - dx / 2 - dy / 2;
        int yC = yA - dy / 2 + dx / 2;
        stroke(0);
        fill(0, 255, 0);
        ellipse(xC + dx / 10f, yC + dy / 12f, dx / 4f, dy / 4f);
        ellipse(xC - dx / 10f, yC - dy / 12f, dx / 4f, dy / 4f);
        fill(0, 0, 0);
        ellipse(xC + dx / 10f, yC + dy / 12f, dx / 12f, dy / 12f);
        ellipse(xC - dx / 10f, yC - dy / 12f, dx / 12f, dy / 12f);

        line(xA, yA, xB, yB);
    }

    public void draw() {
        frogFace(100, height - 100, width - 100, 100);
    }

}
