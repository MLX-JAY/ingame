package points;

public class Dessin 
{
    private AbstractFigure figures[];
    private int currentSize ;
    public Dessin (int taille)
    {
        figures=new AbstractFigure[taille];
        currentSize=0;
    }
    public double sumSurface ()
    {
        double somme=0;
        for (int i=0;i<currentSize;i++)
        {
            somme+=figures[i].calculeSurface();
        }
        return somme;
    }
    public double sumPerimetre ()
    {
        double somme=0;
        for (int i=0;i<currentSize;i++)
        {
            somme+=figures[i].calculePerimtre();
        }
        return somme;
    }
    public void add (AbstractFigure figure)
    {
        if (currentSize<=figures.length)
        {
            figures[currentSize]=figure;
            currentSize++;
        }
    }
    public String toString ()
    {
        StringBuilder resultat=new StringBuilder();
        for (int i=0;i<currentSize;i++)
        {
            resultat.append(figures[i].toString()+"\n");
        }
        return resultat.toString();
    }
}