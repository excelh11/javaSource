package sec07.ex02;
class Airplane {
    public void fly() {
        System.out.println("Airplane is flying");
    }
}

class Jet extends Airplane {
    @Override
    public void fly() {
        System.out.println("제트기는 초음속으로 날고 있습니다");
    }

    public void afterburner() {
        System.out.println("제트는 추가 추력을 위해 애프터버너를 사용합니다");
    }
}
public class CastingEx {

	public static void main(String[] args) {
		  Airplane airplane = new Jet(); // 자동 타입 변환
	        
	        airplane.fly(); 

	        // 자식 클래스에만 존재하는 afterburner() 메소드에는 부모 클래스 타입으로는 접근할 수 없습니다.
	        // airplane.afterburner(); // 컴파일 에러

	        // 강제 타입 변환을 통해 자식 클래스 타입으로 변환하여 afterburner() 메소드에 접근할 수 있습니다.
	        Jet jet = (Jet) airplane; // 강제 타입 변환
	        jet.afterburner();
	}

}
