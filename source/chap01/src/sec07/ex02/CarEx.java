package sec07.ex02;

public class CarEx {

		public static void main(String[] args) {
	        Car car1 = new ElectricCar();
	        Car car2 = new GasolineCar();

	        car1.drive(); // 출력: Driving an electric car
	        car2.drive(); // 출력: Driving a gasoline car
	        // 자동 타입 변환으로 인해 ElectricCar 클래스에만 존재하는 charge() 메소드에는 접근할 수 없습니다.
	        // car1.charge(); // 컴파일 에러
	        
	        // GasolineCar 클래스에만 존재하는 refuel() 메소드에도 접근할 수 없습니다.
	        // car2.refuel(); // 컴파일 에러
	}

}
