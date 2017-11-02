import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {
    Task2 task2 = new Task2();

    @Test
    public void palindrome() throws Exception {
        assertTrue(task2.palindrome("banan") == 3);
        assertTrue(task2.palindrome("aplpabanan") == 5);
        assertTrue(task2.palindrome("sock") == 1);
        assertTrue(task2.palindrome("a") == 1);
        assertTrue(task2.palindrome("adagorogast") == 7);
        assertTrue(task2.palindrome("") == 0);
        assertTrue(task2.palindrome("aBaba")==5);
    }

    @Test(timeout = 1000)
    public void testTimeOutPalindrom() {
        task2.palindrome("jokoker");

    }


    @Test
    public void palindrome1() throws Exception {
        assertTrue(task2.palindrome1("banan") == 3);
        assertTrue(task2.palindrome1("aplpabanan") == 5);
        assertTrue(task2.palindrome1("sock") == 1);
        assertTrue(task2.palindrome1("a") == 1);
        assertTrue(task2.palindrome1("adagorogast") == 7);
        assertTrue(task2.palindrome1("") == 0);
        assertTrue(task2.palindrome1("aBaba")==5);
    }

    @Test(timeout = 1000)
    public void testTimeOutPalindrom1() {
        task2.palindrome1("jokoker");
    }





}