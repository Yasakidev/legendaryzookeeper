package animalrescuediderot;

import java.util.Random;

public class Rand {
    public static int getRandInt(int lowest, int highest) {
        Random r = new Random();
        return r.nextInt(highest+1) + lowest;
    }
}
