package firstjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

  @Test
  public void test1() {
	  Factorial s=new Factorial();
	  int a=4;
	  int actual=s.Fact(a);
	  Assert.assertEquals(actual,24);
 
  }
  @Test
  public void test2() {
	  Factorial s=new Factorial();
	  int a=2;
	  int actual=s.Fact(a);
	  Assert.assertEquals(actual,2);
 
  }
  @Test
  public void test3() {
	  Factorial s=new Factorial();
	  int a=5;
	  int actual=s.Fact(a);
	  Assert.assertEquals(actual,120);
 
  }

}
