package brainfry;

import java.util.Random;

/**
 *
 * @author Mike
 */
public class RandomGen {

    int minSeed = 100;
    int maxSeed = 999;

    Random rnd = new Random();
    int compRnd = rnd.nextInt(maxSeed - minSeed) + minSeed;


}
