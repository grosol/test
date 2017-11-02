import org.junit.Test;

import static org.junit.Assert.*;

public class Task2_f0restTest {
    Task2_f0rest task2 = new Task2_f0rest();
    @Test
    public void getBiggestPalindrom() throws Exception {
        assertTrue(task2.getBiggestPalindrom("banan")==3);
        assertTrue(task2.getBiggestPalindrom("aplpabanan")==5);
        assertTrue(task2.getBiggestPalindrom("sock")==1);
        assertTrue(task2.getBiggestPalindrom("a")==1);
        assertTrue(task2.getBiggestPalindrom("adagorogast")==7);
        assertTrue(task2.getBiggestPalindrom("")==0);
        assertTrue(task2.getBiggestPalindrom("aBaba")==5);
    }

    @Test(timeout = 1000)
    public void testTimeOutPalindrom1() {
        task2.getBiggestPalindrom("jokoker");
    }
}