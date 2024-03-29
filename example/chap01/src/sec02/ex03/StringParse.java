package sec02.ex03;

public class StringParse {

	public static void main(String[] args) {
		// String 타입을 byte 타입으로 변환
		String strByte = "127";
		byte b = Byte.parseByte(strByte);

		// String 타입을 int 타입으로 변환
		String strInt = "123";
		int i = Integer.parseInt(strInt);

		// String 타입을 long 타입으로 변환
		String strLong = "123456789";
		long l = Long.parseLong(strLong);

		// String 타입을 float 타입으로 변환
		String strFloat = "3.14";
		float f = Float.parseFloat(strFloat);

		// String 타입을 double 타입으로 변환
		String strDouble = "3.141592";
		double d = Double.parseDouble(strDouble);

	}

}
