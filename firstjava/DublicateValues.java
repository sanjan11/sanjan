package firstjava;

import java.util.Arrays;

public class DublicateValues {
	static int Remove(int a[]){
		int a1=a.length;
		if(a1==0||a1==1)
			return a1;
		int[] temp=new int[a1];
		int j=0;
		for(int i=0;i<a1-1;i++){
			if(a[i]!=a[i+1])
				temp[j++]=a[i];
		}
			temp[j++]=a[a1-1];
			for(int i=0;i<j;i++)
				a[i]=temp[i];
			return j;
		
	}
	
	public static void main(String[] args) {
		int a[]={2,2,3,2,1,3,4,4,1};
		Arrays.sort(a);
	
		int a1 = Remove(a);
		for(int i=0;i<a1;i++)
			System.out.println(a[i]);
	}

}
