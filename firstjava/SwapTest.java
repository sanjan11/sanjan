package firstjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapTest {
  @Test
  public void test() {
	  
	  Swap s=new Swap();
	  int a=30;
	  int b=40;
	  int actual=s.SwapTwo(a, b);
	  int expected=s.SwapTwo(40,30);
	  Assert.assertEquals(actual, expected);
  }
  @Test
  public void test2() {
	  
	  Swap s=new Swap();
	  int a=-30;
	  int b=-40;
	  int actual=s.SwapTwo(a, b);
	  int expected=s.SwapTwo(-40,-30);
	  Assert.assertEquals(actual, expected);
  }
  
  @Test
  public void test3() {
	  
	  Swap s=new Swap();
	  int a=-30;
	  int b=40;
	  int actual=s.SwapTwo(a, b);
	  int expected=s.SwapTwo(40,-30);
	  Assert.assertEquals(actual, expected);
  }
  @Test
  public void test4() {
	  
	  Swap s=new Swap();
	  int a=0;
	  int b=0;
	  int actual=s.SwapTwo(a, b);
	  int expected=s.SwapTwo(0,0);
	  Assert.assertEquals(actual, expected);
  }
}
