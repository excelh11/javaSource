package sec11.ex01;

public class ReplaceTrimEx {

	public static void main(String[] args) {
		// replace
		String text = "Hello, World!";
		String replacedText = text.replace("World", "Java");
		System.out.println("치환된 문자열: " + replacedText);
		
		// trim
		String trimText = "   Hello, World      !     ";
		String trimmedText = trimText.trim();
		System.out.println("공백 제거된 문자열: " + trimmedText);
	}

}
