package sec02.ex01;

public class Scope02 {

	public static void main(String[] args) {

	    int x1 = 10;
	    
	    if(true) {	// 첫번째 if블록 시작	
	        int x2 = 20;
	         x1 = 30;
	        System.out.println("x = " + x2);//20
	        System.out.println("x = " + x1);//10
	    }// 첫번째 if끝   30
	    
	    if(true)   {	
	            int x3 = 30;

	        System.out.println("x = " + x3);//30
	        System.out.println("x = " + x1);//10
	     // System.out.println("x = " + x2);
	    } 
	        System.out.println("x = " + x1);//10
	     //	System.out.println("x = " + x3);
		
	}
}
