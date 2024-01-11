package sec02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		// int 4byte, double 8byte
	    int myInt1 = 9;
	    double myDouble1 = myInt1;

	    System.out.println(myInt1); //9
	    System.out.println(myDouble1); //9.0
	    
	   
	    double myDouble2 = 9.78;
	    int myInt2 = (int) myDouble2;

	    System.out.println(myDouble2); 
	    System.out.println(myInt2);  
	    
	    
	    
	    byte byteValue = 65;
	    // char 타입의 허용범위가 음수를 포함하지 않는다.
	    // byte -127~128
	    // char charValue = byteVale;
	     
	}

}
