package firstjava;

public class Swap {
	static int SwapTwo(int a,int b){
	     a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println(a+"  "+b);

      return 0;

	} 
	public static void main(String[] args) {

		int a=10;
		int b=20;
        
		SwapTwo(a,b);
	}

}
