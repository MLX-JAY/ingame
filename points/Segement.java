package points;

public class Segement 
{
    private Point points [] = new Point[2]; 
    public Segement (Point point1 , Point point2)
    {
        points[0]=point1;
        points[1]=point2;
    }
    public Segement( int x1 , int y1 , int x2 , int y2)
    {
        points[0]=new Point(x1,y1);
        points[1]=new Point(x2,y2);
    }
    public String toString()
    {
        return points[0].toString()+" "+points[1].toString();
    }
    public void move (int dx , int dy)
    {
        points[0].move(dx, dy);
        points[1].move(dx, dy);
    }
    public double length ()
    {
        return Math.sqrt(Math.pow(points[1].getX()-points[0].getX(),2)+Math.pow(points[1].getY()-points[0].getY(),2));
    }
}
