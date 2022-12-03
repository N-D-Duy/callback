package async;

import java.util.Random;

public class Computer {
    Random random = new Random();

    public int getRandom() {
        return random.nextInt(9);
    }
}
