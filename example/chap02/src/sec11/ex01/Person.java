package sec11.ex01;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // name 필드의 게터 메서드
    public String getName() {
        return name;
    }

    // name 필드의 세터 메서드
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Person) {				// 매개값이 Person 타입인지 확인합니다
    	   Person person = (Person) obj;		// Person 타입으로 변환하고 
    	   if(name.equals(person.name)) {	// name필드값이 동일한지 검사 후
    		   return true;						// 동일 하면 true를 반환합니다
    	   }
       }
       return false;								// 매개값이 Person 타입이 아니거나 
       												// name필드값이 다른 경우 false를 반환합니다
    }
    @Override
    public int hashCode() {					
        return Objects.hash(name);			// name필드의 hash코드값을 반환합니다
    }
}
