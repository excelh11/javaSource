package sec13.ex01;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
    	// ArrayList 생성
        List<String> list = new ArrayList<>();

        // 원소 추가
        list.add("바나나");
        list.add("사과");
        list.add("오렌지");

        // 원소 조회
        System.out.println("리스트 : ");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 원소 삭제
        list.remove("바나나");
        list.remove(1);	// 1번 인덱스 삭제
        
        // 개수 출력
        int size = list.size();
        System.out.println("총 요소 수 : "+ size);
        
        // 변경된 리스트 출력
        System.out.println("업데이트 한 리스트 : ");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
