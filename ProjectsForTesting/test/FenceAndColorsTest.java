import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by yaoun on 02.11.2017.
 */
public class FenceAndColorsTest {
    public FenceAndColors fnc = new FenceAndColors();

    @DataProvider(name = "CountWays")
    public static Object[][] credentials() {
        return new Object[][] { {2,4,16}, {3,4,48}};
    }

    @DataProvider (name = "Exception")
    public static Object[][] credentials_exc() {
        return new Object[][] { {-12,15}, {3,0}, {5,-8}};
    }

    @Test(dataProvider="CountWays")
    public void testCountWays1(int n, int k, int expec) throws Exception {
        long actual = fnc.countWays(n,k);
        System.out.println();
        Assert.assertEquals(actual, expec);
    }

    @Test(dataProvider = "Exception")
    public void testExcCountWays(int n, int k) throws Exception {
        long actual = fnc.countWays(n,k);
    }

    @Test(timeOut = 1000)
    public void testTimeCountWays() throws Exception {
        long actual = fnc.countWays(10000, 1000);
    }

}