package sec06.ex07;// modifiers클래스와 패키지가 다름

import sec06.ex06.Modifiers;

public class Modifiers3 {
	
	public Modifiers3() {
		Modifiers modi = new Modifiers();
		modi.field1 =1;
	//	modi.field2 =2;		default 접근제한자 이므로 에러
	//	modi.field3 =3;		private 접근제한자 이므로 에러
		
		modi.method1();
	//	modi.method2();		default 접근제한자 이므로 에러
	//	modi.method3();		private 접근제한자 이므로 에러
	}
	
}
