public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a)
    {
        boolean hasDight = false;
        address = a;
        for (int x= 0; x < a.length(); ++x)
        {
            if (Character.isDigit(a.charAt(x)))
            {
                hasDight = true;
            }
        }
        if(hasDight)
        {
            rate = 15.00;
        }
        else
        {
            rate = 0;
            System.out.print("\nAddress must contain a digit  ");
        }
    }
}
