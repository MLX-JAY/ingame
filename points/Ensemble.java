package points;

public class Ensemble 
{
    private Point tab [];
    private int size=0;
    public Ensemble (int taille)
    {
        tab=new Point [taille];
    }
    public String toString ()
    {
        StringBuilder temp=new StringBuilder("le tableau est compose de : \n");
        for (int i=0;i<size;i++)
        {
            temp.append(tab[i].toString()+"\n");
        }
        return temp.toString();
    }
    public void move (int dx,int dy)
    {
        for (int i=0;i<size;i++)
        {
            tab[i].move(dx, dy);
        }
    }
    public void add (Point p)
    {
        if (size<tab.length)
        {
            tab[size]=p;
            size++;
        }
    }
}
