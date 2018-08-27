/**
 * Created by jc445081 on 27/08/18.
 */
public class Fiction extends Book {
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 24.99;
    }
}
