package sec02.ex01;

public class Scope02 {

	public static void main(String[] args) {

	    int x1 = 10;
	    
	    if(true) {		
	        int x2 = 20;
	         x1 = 30;
	        System.out.println("x2 = " + x2); //20
	        System.out.println("x1 = " + x1); //30
	    }
	    
	    if(true)   {	
	            int x3 = 30;

	        System.out.println("x3 = " + x3); //30
	        System.out.println("x1 = " + x1); //30
	    } 
	        System.out.println("x1 = " + x1); //30
		
	}
}