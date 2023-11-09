package Program;

import Program.logic.Logic;


public class Program {

	public static void main(String[] args) {
		
	int [] a = {17,21,15,13,5,19,16,9999991};
	Logic al = new Logic();
	
	System.out.println("min :" + al.minArray(a));
	System.out.println("max :" + al.maxArray(a));
	System.out.println("find :" + al.findArray(a, 13));
    
    System.out.println(al.primeNumber(a));
    
	


	}

}
