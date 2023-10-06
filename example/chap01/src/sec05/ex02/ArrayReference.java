package sec05.ex02;

class Study {
    private String name;
    
    public Study(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class ArrayReference {

	public static void main(String[] args) {
		Study[] subject = new Study[3]; // Study 객체를 참조하는 배열 생성
	        
		subject[0] = new Study("mathematics"); // 객체 생성 후 배열에 할당
		subject[1] = new Study("Science");
		subject[2] = new Study("English");
	        
	        for (Study study : subject) {
	            System.out.println(study.getName());
	        }
	}

}
