package javatestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveTest {
  @Test
  public void Test1() {
	  DublicateValues d=new DublicateValues();
	  int a[]={1,2,1,2,3,1,2,3,4};
	DublicateValues.Remove(a);
	
  }
  @Test
  public void Test2() {
	  DublicateValues d=new DublicateValues();
	  int a[]=null;
	 DublicateValues.Remove(a);
	
  }
}
