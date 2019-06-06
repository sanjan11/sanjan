package firstjava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FibonacciTest {
	
	
  @Test
  public void test1() {
	  Fibonacci f=new Fibonacci();
	  int count=5;
	  int actual=f.FibonacciSeries(count);
	  int result =5;
	   Assert.assertEquals(actual, result);
  }
  @Test
  public void test2() {
	  Fibonacci f=new Fibonacci();
	  int c=0;
	  int actual=f.FibonacciSeries(c);
	  int result =0;
	   Assert.assertEquals(actual, result);
  }
  @Test
  public void test3() {
	  Fibonacci f=new Fibonacci();
	  int c=-7;
	  int actual=f.FibonacciSeries(c);
	  int result =0;
	   Assert.assertEquals(actual, result);
  }
  
}
