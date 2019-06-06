package firstjava;

public class Prime {

      static boolean PrimeOrNot(int a){
    int m=a/2;
    int q=0;
    	if(a==0||a==1){
    		System.out.println("not prime");
    	}else {
    		for(int i=2;i<= m;i++){
    			if(a%i==0){
    				System.out.println("not prime");
    				 q=1;
    				break;
    				
    			}
    			
    		}
    		if(q==0){
    			System.out.println("prime number");
    		}
    		
    	}
    	return true;
    	
    }
	
	public static void main(String[] args) {
        int a=10;
    	
        PrimeOrNot(a);
	}

}
