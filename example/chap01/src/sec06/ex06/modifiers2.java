package sec06.ex06;	// modifiers클래스와 패키지가 동일

public class modifiers2 {
	public modifiers2() {
		modifiers modi = new modifiers();
		modi.field1 =1;
		modi.field2 =2;
//		modi.field3 =3;			private 접근제한자 이므로 에러
		
		modi.method1();
		modi.method2();
//		modi.method3();		private 접근제한자 이므로 에러
	}
}
