package Test;

import domain.Orientation;
import org.junit.Assert;
import org.junit.Test;
import service.MowerService;

public class MowerTest {
    private static final String TEST_FILE_NAME = "src/testFile/test.txt";

    @Test
    public void mowTest() {
        var lawn = MowerService.mow(TEST_FILE_NAME);
        Assert.assertEquals(2, lawn.getMowers().size());
        Assert.assertEquals(Orientation.N, lawn.getMowers().get(0).getOrientation());
        Assert.assertEquals(1, lawn.getMowers().get(0).getPosition().getX());
        Assert.assertEquals(3, lawn.getMowers().get(0).getPosition().getY());

    }
}
