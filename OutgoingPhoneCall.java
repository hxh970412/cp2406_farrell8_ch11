public class OutgoingPhoneCall extends PhoneCall{
    public final double PATE = 0.04;
    private int minute;
    public OutgoingPhoneCall(String num, int min)
    {
        super(num);
        minute = min;
        price = PATE * minute;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public void getInfo() {
        System.out.println("The outgoing Phone Number is " + getPhoneNum() + " " + PATE + " per minute at " +
                minute + "minutes. Total cost is $" + price)
        ;
    }
}
