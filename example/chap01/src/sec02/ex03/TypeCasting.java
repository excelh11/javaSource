package sec02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		// int(4byte)에서 double(8byte)로 대입할땐 자동으로 타입이 변환됩니다.
	    int myInt1 = 9;
	    double myDouble1 = myInt1;

	    System.out.println(myInt1); 
	    System.out.println(myDouble1); 
	    
	    // double에서 int로 대입할땐 수동으로 타입을 변환해야 합니다. 
	    double myDouble2 = 9.78;
	    int myInt2 = (int) myDouble2; // 다운캐스팅을 할때는 (변환할 타입명)을 넣어줘야 합니다.

	    System.out.println(myDouble2); 
	    System.out.println(myInt2);   
	}

}
