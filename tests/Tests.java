import java.util.Random;
import java.util.stream.IntStream;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests
{
    @Test
    public void testBasic()
    {
        assertEquals(9, Kata.squareSum(new int[] {1,2,2}));
        assertEquals(5, Kata.squareSum(new int[] {1,2}));
        assertEquals(50, Kata.squareSum(new int[] {5,-3,4}));
        assertEquals(0, Kata.squareSum(new int[] {}));
    }

    @Test
    public void testRandom()
    {
        Random rnd = new Random();
        for(int t=0; t<100; ++t) {
            int[] array = IntStream.generate( () -> rnd.nextInt(100) - 50).limit(rnd.nextInt(20) + 30).toArray();
            int sum = IntStream.of(array).map(i->i*i).sum();
            assertEquals(sum, Kata.squareSum(array));
        }
    }
}