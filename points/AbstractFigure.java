package points;



public abstract class AbstractFigure 
{
    private int longeur;
    private Point point;
    public AbstractFigure (int longeur,Point point)
    {
        this.longeur=longeur;
        this.point=point;
    }
    public abstract double calculeSurface();
    public abstract double calculePerimtre();
    public int getLongeur ()
    {
        return longeur;
    }
    public Point getPoint ()
    {
        return point;
    }

}
