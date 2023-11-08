package Program.logic;

import java.util.LinkedList;

public class Logic {
	
	public int minArray(int[] a) {
		int min =0;
		
		for(int i =0; i<a.length; i++) {
			if(i == 0) {
				min = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		
		return min;
	}
	
	
	public int maxArray(int[] a) {
		int max =0;
		
		for(int i =0; i<a.length; i++) {
			if(i == 0) {
				max = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		
		return max;
	}
	
	public int findArray(int[] a, int n) {
		
		int find = 0 ;
		
		for(int i =0; i<a.length; i++) {
			if(i == n) {
				find = a[i];
			}
	
		}
	
		return find;
		
	}
	
	
	public LinkedList<Integer> primeNumber(int[] a) {
		
		//int k=0;
		LinkedList<Integer> res = new LinkedList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=1;j<=a[i] ;j++)
			{
				if(a[i]%j == 0)
					count++;
				
				//k++;
			}
			if(count == 2) {
//				System.out.print(a[i]+",");
				res.add(a[i]);
			}
			
			
		}
		//System.out.println("Length: "+k);

		return res;
		
	}
	
	
	

	

}
