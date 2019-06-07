package javatestcases;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class DublicateValues {
	
	public static int Remove(int a[]){
	try{
		HashSet<Integer> l=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			if(l.add(a[i])){
				System.out.println(a[i]);
			}
		}
		}catch(NullPointerException e){
			System.out.println(e);
		}
	
		return 0;
		
	}

	public static void main(String[] args) {
		int a[]={1,2,1,3,2,4,3,4,2,5};
		Remove(a);
	}

}
