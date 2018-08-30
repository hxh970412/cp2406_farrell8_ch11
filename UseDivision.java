public abstract class UseDivision
{
    public static void main(String[] args)
    {
        DomesticDivision abcDomDiv = new
                DomesticDivision("AAA", 122, "DDDDD");
        DomesticDivision xyzDomDiv = new
                DomesticDivision("fffff", 156, "LLLLL");
        InternationalDivision abcIntDiv = new
                InternationalDivision("CCC", 555, "GGGGG", "Gmmmm");
        InternationalDivision xyzIntDiv = new
                InternationalDivision("UUUUU", 489, "LLLL",
                "OOOOO");
        abcDomDiv.display();
        xyzDomDiv.display();
        abcIntDiv.display();
        xyzIntDiv.display();
    }
}
