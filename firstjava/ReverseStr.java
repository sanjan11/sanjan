package firstjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStr {
  @Test
  public void test1() {
	  ReverseString r=new ReverseString();
	  String s="sumanth";
	  String actual=r.Reverse(s);
	  String expected=r.Reverse(s);
	  Assert.assertEquals(actual,expected);
  }
  @Test
  public void test2() {
	  ReverseString r=new ReverseString();
	  String s="abcde";
	  String actual=r.Reverse(s);
	  String expected=r.Reverse(s);
	  Assert.assertEquals(actual,expected);
  }
  @Test
  public void test3() {
	  ReverseString r=new ReverseString();
	  String s="123";
	  String actual=r.Reverse(s);
	  String expected=r.Reverse(s);
	  Assert.assertEquals(actual,expected);
  }
  
}
