public class DemoSubscriptions {
    public static void main(String[] args)
    {
        PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
        PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
        pnsGood.setName("DDD");
        pnsGood.setAddress("55 FFFFFF DSSS");
        dislay(pnsGood);
        pnsBad.setName("TTT");
        pnsBad.setAddress("5556 AAAAA AAA");
        dislay(pnsBad);
        onsGood.setName("FFFFF");
        onsGood.setAddress("5555 FFGGGG");
        dislay(onsGood);
        onsBad.setName("HHHH");
        onsBad.setAddress("666 HHHJJJJ");
        dislay(onsBad);
    }
    public static void dislay(NewspaperSubscription n)
    {
        System.out.println("Name: " + n.getName() + " Address: " + n.getAddress() + " Rate: " +n.getRate());
    }
}
