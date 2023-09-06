package sec06.ex06;

public class modifiers {

	//필드
	public int field1;			//public 접근 제한자
	int field2;						//default 접근 제한자
	private int field3;			//private 접근 제한자
	
	// 생성자
	public modifiers() {
		field1 =1;
		field2 =2;
		field3 =3;
		
		method1();
		method2();
		method3();
	}
	
	// 메서드
	public void method1() {};		//public 접근 제한자
	void method2() {};				//default 접근 제한자
	private void method3() {};	//private 접근 제한자
}
