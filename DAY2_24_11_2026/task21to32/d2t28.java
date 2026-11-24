interface SmartDevice {
    void connectWiFi();
    default void deviceStatus() {
        System.out.println("Smart device is ready");
    }
}
class SmartTV implements SmartDevice {
    @Override
    public void connectWiFi() {
        System.out.println("Smart TV connected to WiFi");
    }
}
class SmartWatch implements SmartDevice {
    @Override
    public void connectWiFi() {
        System.out.println("Smart Watch connected to WiFi");
    }
}
public class d2t28 {
    public static void main(String[] args) {
        SmartDevice tv = new SmartTV();
        SmartDevice watch = new SmartWatch();
        tv.connectWiFi();
        tv.deviceStatus();
        watch.connectWiFi();
        watch.deviceStatus();
    }
}