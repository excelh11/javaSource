package sec07.ex02;

public class CarEx2 {

		public static void main(String[] args) {
	        Car car1 = new ElectricCar();
	        Car car2 = new GasolineCar();

	        car1.drive(); // 출력: Driving an electric car
	        car2.drive(); // 출력: Driving a gasoline car
	        
	        // 실제 객체의 타입에 따라 다시 자식 클래스 타입으로 형변환하여 멤버에 접근할 수 있습니다.
	        if (car1 instanceof ElectricCar) {
	            ElectricCar electricCar = (ElectricCar) car1;
	            electricCar.charge(); // 출력: Charging the electric car
	        }

	        if (car2 instanceof GasolineCar) {
	            GasolineCar gasolineCar = (GasolineCar) car2;
	            gasolineCar.refuel(); // 출력: Refueling the gasoline car
	        }
	}

}
