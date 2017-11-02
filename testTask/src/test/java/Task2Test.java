import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task2Test {
    Task2 task2 =new Task2();


  @DataProvider(name = "SerchMaxAmountOfCost")
  public static Object[][] amount(){

      return  new Object[][]{{new int []{1,5,4,5,3},new int[]{3,7,8,7,6},5,20},
              {new int[] {1,5,4,5,3},new int[] {3,7,10,7,6},5,21},
              {new int[] {1,5,8,5,3}, new int[] {3,7,10,7,21},5,37}};
  }

    @Test(dataProvider = "SerchMaxAmountOfCost")
    public void testSerchMaxAmountOfCost(int[]low, int[]hight,int days,int expec) throws Exception {
      int actual = task2.serchMaxAmountOfCost(low,hight,days);
        Assert.assertEquals(actual,expec);

    }


}