package points;

public class PointTest 
{
    public static void main(String[] args)
    {
        Point p = new Point(1,2);
        ColoredPoint cp = new ColoredPoint(3,4,"red");
        System.out.println(p);
        System.out.println(cp);
        cp.move(1,2);
        System.out.println(cp);
        cp.setcolor("green");
        System.out.println(cp);
        System.out.println(cp.getcolor());
        System.out.println(cp.getX());
        System.out.println(cp.getY());
        System.out.println(cp.toString());
        p.setX(0);
        p.setY(0);    
        System.out.println(p);
    }
    
}
