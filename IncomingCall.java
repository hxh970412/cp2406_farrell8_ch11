public class IncomingCall extends PhoneCall{
    public final double PATE = 0.02;
    public IncomingCall(String num)
    {
        super(num);
        price = PATE;
    }

    @Override
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void getInfo() {
        System.out.println("The incoming PhoneCall number is " + getPhoneNum() + " " + PATE +
                " per call price and the total is $" + getPrice());
    }
}
