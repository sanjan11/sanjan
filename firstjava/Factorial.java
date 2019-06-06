package firstjava;


public class Factorial {

	 static  int Fact(int a){
			  if (a==0)    
		    return 1;    
		  else    
		    return(a*Fact(a-1));    
		 }    
		 public static void main(String args[]){  
		  int f=1;  
		  int n=4;  
		   f=Fact(n);
		  System.out.println(f);    
		 }  
}
