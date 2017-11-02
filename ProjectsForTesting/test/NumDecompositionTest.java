import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by yaoun on 02.11.2017.
 */
public class NumDecompositionTest {
    public NumDecomposition obj = new NumDecomposition();

    @DataProvider(name = "CountWays")
    public static Object[][] credentials() {
        return new Object[][] { {3,2}, {5,6}, {7,14}};
    }

    @DataProvider (name = "badValue")
    public static Object[][] credentials_exc() {
        return new Object[][] {{0}, {-5}};
    }

    @Test(dataProvider="CountWays")
    public void testCountWays1(int num, int expec) throws Exception {
        int actual = obj.countWays(num);
        Assert.assertEquals(actual, expec);
    }

    @Test(dataProvider = "Exception")
    public void testExcCountWays(int num) throws Exception {
        int actual = obj.countWays(num);
    }

    @Test(timeOut = 1000)
    public void testTimeCountWays() throws Exception {
        int actual = obj.countWays(10000);
    }

}