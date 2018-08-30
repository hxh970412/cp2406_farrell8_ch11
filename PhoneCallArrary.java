public class PhoneCallArrary {
    public static void main(String[] args)
    {
        PhoneCall calls[] = new PhoneCall[10];
        int i;
        calls[0] = new IncomingCall("354646");
        calls[1] = new OutgoingPhoneCall("32323", 5);
        calls[2] = new IncomingCall("1314");
        calls[3] = new OutgoingPhoneCall("354654", 3);
        calls[4] = new IncomingCall("1314124");
        calls[5] = new OutgoingPhoneCall("1516436", 7);
        calls[6] = new IncomingCall("468766");
        calls[7] = new OutgoingPhoneCall("16313", 4);
        calls[8] = new IncomingCall("151351");
        calls[9] = new OutgoingPhoneCall("16326235", 1);
        for (i = 0; i < calls.length; ++i)
        {
            calls[i].getInfo();
        }
    }
}
