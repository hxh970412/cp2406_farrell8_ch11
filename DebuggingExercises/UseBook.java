/**
 * Created by jc445081 on 27/08/18.
 */
public class UseBook {
    public static void main(String[] args)
    {
        Fiction Novel = new Fiction("JCU story");
        NonFiction Manual = new NonFiction("learning about JCU");
        System.out.println("Fiction " + Novel.getTitle() + "'s price is $" + Novel.getPrice());
        System.out.println("Nonfiction " + Manual.getTitle() + "'s price is $" + Manual.getPrice());
    }
}
