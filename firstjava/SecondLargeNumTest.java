package firstjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondLargeNumTest {
  @Test
  public void test1() {
	SecondLargeNum  s=new SecondLargeNum();
	int a[]={1,2,5,6,3,2};
	int actual=s.SecondLargest(a);
	  Assert.assertEquals(actual,5);
  }
  
  @Test
  public void negetive() {
	SecondLargeNum  s=new SecondLargeNum();
	int a[]={-1,-2,-5,-6,-3};
	int actual=s.SecondLargest(a);
	  Assert.assertEquals(actual,-2);
  }
  @Test
  public void greater() {
	SecondLargeNum  s=new SecondLargeNum();
	int a[]={1,2,5,6,3,2,10,8};
	int actual=s.SecondLargest(a);
	  Assert.assertEquals(actual,8);
  }
  @Test
  public void lessthan() {
	SecondLargeNum  s=new SecondLargeNum();
	int a[]={1,2,5,3,6};
	int actual=s.SecondLargest(a);
	  Assert.assertEquals(actual,5);
  }
  @Test
  public void dublicate() {
	SecondLargeNum  s=new SecondLargeNum();
	int a[]={1,2,3,8,10,8,5,5};
	int actual=s.SecondLargest(a);
	  Assert.assertEquals(actual,8);
  }
  
}