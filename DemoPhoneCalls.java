public class DemoPhoneCalls {
    public static void main(String[] args)
    {
        IncomingCall InCall = new IncomingCall("3351435");
        OutgoingPhoneCall OutCall = new OutgoingPhoneCall("12314214", 5);
        InCall.getInfo();
        OutCall.getInfo();
    }
}
