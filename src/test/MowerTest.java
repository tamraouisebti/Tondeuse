package test;

import domain.Orientation;
import org.junit.Assert;
import org.junit.Test;
import service.MowerService;

/**
 * Test class
 */
public class MowerTest {
    private static final String TEST_FILE_NAME = "src/testFile/test.txt";

    /**
     * Test according to the example given in the description of the exercise
     */
    @Test
    public void mowTest() {
        var lawn = MowerService.mow(TEST_FILE_NAME);
        Assert.assertEquals(2, lawn.getMowers().size());
        Assert.assertEquals(Orientation.N, lawn.getMowers().get(0).getOrientation());
        Assert.assertEquals(1, lawn.getMowers().get(0).getPosition().getX());
        Assert.assertEquals(3, lawn.getMowers().get(0).getPosition().getY());

    }
}
