package sec09.ex03;

public class PowerEx {

	public static void main(String[] args) {
		PowerController powerController = new PowerController(0);

		powerController.checkBattery(new PowerController.BatteryIndicator() {
		    @Override
		    public int getBatteryLevel() {
		        // 실제로 배터리 레벨을 반환하는 로직
		        return 75;
		    }
		});
	}

}
