package sec09.ex03;

public class PlayerEx {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

	        // Speaker 인터페이스를 익명 구현 객체로 생성
	        Speaker speaker = new Speaker() {
	            @Override
	            public void playSound() {
	                System.out.println("재생중...");
	            }
	        };
	
	        audioPlayer.playMusic(speaker);
    	}

}
