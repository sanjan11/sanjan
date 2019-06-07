package javatestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseNumTest {
  @Test
  public void test1() {
	  ReverseNumber r=new ReverseNumber();
	  int a=0;
	  int actual=ReverseNumber.Reverse(a);
	  Assert.assertEquals(actual,0);
  }
  @Test
  public void test2() {
	  ReverseNumber r=new ReverseNumber();
	  int a=123;
	  int actual=ReverseNumber.Reverse(a);
	  Assert.assertEquals(actual,321);
  }
  @Test
  public void test3() {
	  ReverseNumber r=new ReverseNumber();
	  int a=-12;
	  int actual=ReverseNumber.Reverse(a);
	  Assert.assertEquals(actual,0);
  }
}
