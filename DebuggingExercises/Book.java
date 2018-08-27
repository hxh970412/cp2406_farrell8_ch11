/**
 * Created by jc445081 on 27/08/18.
 */
public abstract class Book {
    String title = new String();
    double price;
    public Book(String Title)
    {
        title = Title;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
