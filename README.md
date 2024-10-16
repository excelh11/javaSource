# javaSource

## chap01 (sec02-sec07)

### p40 결과 수정

    x2 = 20
    x1 = 30
    x3 = 30
    x1 = 20
    x1 = 20

### p56 tip 내용 변경 ->

System.out과 PrintStream
System.out은 System 클래스의 정적 멤버이며 실제로는 PrintStream 객체입니다.
이 객체를 통해 콘솔로 데이터를 출력할 수 있습니다.
System.out은 출력 스트림의 한 예라고 볼 수 있으며 자바에서 입출력(I/O)은 스트림을 통해 이루어집니다.

### p63 (2)비교 연산 설명 추가->

- 동등 비교(==) 연산자는 두 값이 서로 동일한지 비교합니다. ->
- 동등 비교(==) 연산자는 두 값이 서로 동일한지 비교합니다.(기본타입만 두 값이 같은지 비교, 참조타입 값이 동일한지 비교할때는 eqeuls() 사용합니다)

### p84 코드 수정 ->

while (number < 1 || number > 10); 를 ->
while (number >= 1 && number <= 10); 로 변경

System.out.println("입력한 숫자는 " + number + "입니다.") 를 ->
System.out.println("그외 숫자 " + number + "를 입력하셨습니다."); 로 변경

## chap02 (sec08-sec12)

## chap03 (sec13-sec16)
