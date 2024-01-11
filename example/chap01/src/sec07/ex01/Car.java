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
	
	  private String modelName = "Mustang";   
	  
	  @Override
	    public void honk() {                   
		    System.out.println("빵빵!");
		  }
//	  @Override
//	  public void stop() {
//		  System.out.println("멈춥니다.");
//	  }
	  public static void main(String[] args) {
	    Car myCar = new Car();
	    myCar.honk();
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
	  
}