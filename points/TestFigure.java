package points;

public class TestFigure 
{
    public static void main ( String args [])
    {
        Dessin d = new Dessin(10);
        d.add(new Cercle(1, new Point(0, 0)));
        d.add(new Rectangle(4, 5, new Point(0, 0)));
        System.out.println(d);
    }    
}
