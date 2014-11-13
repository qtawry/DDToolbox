package be.tdev.diceroller;

import java.util.Random;

/**
 * Created by delskev on 13/11/2014.
 */
public class Dice {
    int faces;
    int value;

    public Dice() {
        this.faces = 6;
        this.value = 0;
    }

    public Dice( int faces) {
        this.faces = faces;
    }

    public int Roll() {
        Random rand = new Random();
        this.value = rand.nextInt(faces) + 1;

        return this.value;
    }
}
