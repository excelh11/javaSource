package sec09.ex02;

public class PowerController implements PowerSwitch, PowerSwitch.Indicator {
    private boolean isPowerOn;

    public void turnOn() {
        isPowerOn = true;
        System.out.println(isPowerOn);
    }

    public void turnOff() {
        isPowerOn = false;
        showPowerOff();
    }

    public void showPowerOn() {
        System.out.println("화면 on");
    }

    public void showPowerOff() {
    	 System.out.println("화면 off");
    }
}