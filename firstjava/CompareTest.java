package javatestcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareTest {
  @Test
  public void test1() {
	  Compare c=new Compare();
	  int a[]={1,2,3};
	  int b[]={1,2,3};
	  boolean r=Compare.CompareArry(a, b);
	  AssertJUnit.assertTrue(r);
  }
  @Test
  public void test2() {
	  Compare c=new Compare();
	  int a[]=null;
	  int b[]={1,2};
	  boolean r=Compare.CompareArry(a, b);
	  AssertJUnit.assertFalse(r);
  }
  @Test
  public void test3() {
	  Compare c=new Compare();
	  int a[]={1,2,3,4,5,6};
	  int b[]={1,2};
	  boolean r=Compare.CompareArry(a, b);
	  AssertJUnit.assertFalse(r);
  }
}
