interface Alert {
    void sendAlert(String message);
}
class EmailAlert implements Alert {
    @Override
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}
class MobileAlert implements Alert {
    @Override
    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}
public class d2t26 {
    public static void main(String[] args) {
        Alert emailAlert = new EmailAlert();
        Alert mobileAlert = new MobileAlert();
        emailAlert.sendAlert("hi");
        mobileAlert.sendAlert("hello");
    }
}