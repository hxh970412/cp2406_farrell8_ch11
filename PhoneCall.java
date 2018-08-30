public abstract class PhoneCall {
    String phoneNum;
    double price;

    public PhoneCall(String num)
    {
        phoneNum = num;
        price = 0.0;
    }
    public void setPrice(double p) {
        price = p;
    }

    public abstract double getPrice();

    public abstract String getPhoneNum();
    public abstract void getInfo();
}
