package sec07.ex01;

class Vehicle {
	  protected String brand = "Volvo";      
	  public void honk() {                  
	    System.out.println("Tuut, tuut!");
	  }
	  // final 메소드
	  public final void stop() {
		  System.out.println("멈춥니다.");
	  }
}

class Car extends Vehicle {
	
	  public String modelName = "Mustang";   
	  
	  
	    public void honk() {                   
		    System.out.println("빵빵!");
		  }
	  
//	  @Override
//	  public void stop() {
//		  System.out.println("멈춥니다.");
//	  }
	  public static void main(String[] args) {
		  Vehicle myCar = new Car();
	    myCar.honk();
	    System.out.println(((Car)myCar).modelName);
	  }
	  
}