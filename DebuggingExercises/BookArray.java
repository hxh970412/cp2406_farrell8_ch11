/**
 * Created by jc445081 on 27/08/18.
 */
public class BookArray {
    public static void main(String[] args)
    {
        Book someBooks[] = new Book[10];
        int x;
        someBooks[0] = new NonFiction("ZZZ");
        someBooks[1] = new Fiction("AAA");
        someBooks[2] = new NonFiction("BBB");
        someBooks[3] = new Fiction("CCC");
        someBooks[4] = new NonFiction("DDD");
        someBooks[5] = new Fiction("EEE");
        someBooks[6] = new NonFiction("FFF");
        someBooks[7] = new Fiction("GGG");
        someBooks[8] = new NonFiction("HHH");
        someBooks[9] = new Fiction("III");
        for(x = 0; x < someBooks.length; ++x)
        {
            System.out.println("Book name is " + someBooks[x].getTitle() + "'s price is $" + someBooks[x].getPrice());
        }
    }

}
