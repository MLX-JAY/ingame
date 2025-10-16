package points;

public class Cercle extends AbstractFigure
{
    public Cercle(int longeur,Point point)
    {
        super(longeur,point);
    }
    public double calculeSurface()
    {
        return Math.PI*getLongeur()*getLongeur();
    }
    public double calculePerimtre()
    {
        return 2*Math.PI*getLongeur();
    }
    public String toString()
    {
        return "Cercle de centre "+getPoint()+" et de rayon "+getLongeur();
    }
}
