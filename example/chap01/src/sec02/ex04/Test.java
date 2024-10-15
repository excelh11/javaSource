package sec02.ex04;

public class Test {
    public static void main(String[] args) {
    	// 기사 실기 출제 시험문제 
        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}

