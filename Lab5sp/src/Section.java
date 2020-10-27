import java.util.ArrayList;

public class Section implements Element

{
    public String sectionTitle;
    ArrayList<Element> elements = new ArrayList<>();


    public Section(String title)
    {
        this.sectionTitle=title;
    }

    public void add(Element elem)
    {
        elements.add(elem);
    }
    public void remove(Element elem)
    {
        elements.remove(elem);
    }

    public Element getElemet(int index )
    {
        return elements.get(index);
    }

    @Override
    public void print() {
        System.out.println("Titlu:" + sectionTitle);
        for(Element e: elements)
        {
            e.print();
        }
    }
}
