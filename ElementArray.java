public class ElementArray {
    public static void main(String[] args)
    {
        Element element[] = new Element[5];
        int i;
        element[0] = new MetalElement("FF", 89, 26.3);
        element[1] = new NonMetalElement("GG", 32, 3.60);
        element[2] = new MetalElement("LL", 14, 65.00);
        element[3] = new NonMetalElement("PP", 65, 889);
        element[4] = new MetalElement("AD", 54, 78);
        for (i = 0; i < element.length; ++i)
        {
            element[i].describeElement();
        }
    }
}
