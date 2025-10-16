package points;

public class Rectangle extends AbstractFigure
{
    private int largeur;
    public Rectangle(int longeur,int largeur,Point point)
    {
        super(longeur,point);
        this.largeur=largeur;
    }
    public double calculeSurface()
    {
        return getLongeur()*getLongeur();
    }
    public double calculePerimtre()
    {
        return 2*getLongeur();
    }
    public String toString()
    {
        return "Rectangle de centre "+getPoint()+" et de longueur "+getLongeur()+" et de largeur "+largeur;
    }
}
