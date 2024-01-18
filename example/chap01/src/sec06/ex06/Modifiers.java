package sec06.ex06;

public class Modifiers {
		//필드
		public int field1;			
		int field2;				
		private int field3;			
		
		// 생성자
		public Modifiers() {
			field1 =1;
			field2 =2;
			field3 =3;
			
			method1();
			method2();
			method3();
		}
		
		// 메서드
		public void method1() {};		
		void method2() {};			
		private void method3() {};		
}
