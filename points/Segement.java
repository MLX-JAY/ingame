package points;

public class Segement 
{
    private Point point1;
    private Point point2;
    public Segement (Point point1 , Point point2)
    {
        this.point1=point1;
        this.point2=point2;
    }
    public Segement( int x1 , int y1 , int x2 , int y2)
    {
        this.point1=new Point(x1,y1);
        this.point2=new Point(x2,y2);
    }
    public String toString()
    {
        return point1.toString()+" "+point2.toString();
    }
    public void move (int dx , int dy)
    {
        point1.move(dx, dy);
        point2.move(dx, dy);
    }
    public double length ()
    {
        return Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
    }
}
