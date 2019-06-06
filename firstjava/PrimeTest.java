package firstjava;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {
  @Test
  public void test1() {
	  Prime p=new Prime();
	  int a=3;
	  boolean actual=p.PrimeOrNot(a);
	  Assert.assertTrue(true);
  }
  @Test
  public void test2() {
	  Prime p=new Prime();
	  int a=4;
	  boolean actual=p.PrimeOrNot(a);
	  Assert.assertFalse(false);
  }
  @Test
  public void test3() {
	  Prime p=new Prime();
	  int a=10;
	  boolean actual=p.PrimeOrNot(a);
	  Assert.assertFalse(false);
  }
  @Test
  public void test4() {
	  Prime p=new Prime();
	  int a=3;
	 boolean actual=p.PrimeOrNot(a);
	  boolean ex=true;
	 assertEquals(actual, ex);
  }

}
