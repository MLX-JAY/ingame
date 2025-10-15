package points;

public class PointTest 
{
    public static void main(String[] args)
    {
        Ensemble ensemble=new Ensemble(5);
        ensemble.add(new Point(1,2));
        ensemble.add(new Point(3,4));
        System.out.println(ensemble);
        ensemble.move(1,1);
        System.out.println(ensemble);

    }
    
}
