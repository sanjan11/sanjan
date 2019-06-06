package firstjava;

public class ReverseString {
	static String Reverse(String s){
		
		for(int i=s.length()-1;i>=0;i--){
			String rev=" ";
			rev=rev+s.charAt(i);
		System.out.print(rev);
		}
		return s;
	}
	
	public static void main(String[] args) {
		String s="sanjan";
		
		Reverse(s);
	}

}
