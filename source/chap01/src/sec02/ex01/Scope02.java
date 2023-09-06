package sec02.ex01;

public class Scope02 {

	public static void main(String[] args) {
	    int x1 = 10;
	    
		    if(true) {	// 첫번째 if 블록 범위
		        int x2 = 20;

		        System.out.println("x2 = " + x2);
		        System.out.println("x1 = " + x1);
		    }// 첫번째 범위 끝
		    
		        if(true)   {	// 두번째 if블록 범위
		            int x3 = 30;

		            System.out.println("x3 = " + x3);
		            System.out.println("x1 = " + x1);
//		            System.out.println("x2 = " + x2);
		        }// 두번째 범위 끝
		        System.out.println("x1 = " + x1);
//		        System.out.println("x3 = " + x3);
		    }

}
