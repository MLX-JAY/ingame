package points;
import java.lang.IllegalArgumentException;
public class Point 
{
    private int x;
    private int y;
    public Point (int x,int y)
    {
        setX(x);
        setY(y);
    }

    public void move (int dx ,int dy) throws IllegalArgumentException
    {
        setX(x+dx);
        setY(y+dy);
    }
    public String toString()
    {
        return "("+x+","+y+")";
    }
    public void setX(int x) throws IllegalArgumentException
    {
        if (x>500 || x<-500)
        {
            throw new IllegalArgumentException("x trop grand");
        }
        this.x=x;
    }
    public void setY(int y) throws IllegalArgumentException
    {
        if (y>500 || y<-500)
        {
            throw new IllegalArgumentException("y trop grand");
        }
        this.y=y;
    }public int getX()
    {
        
        return x;
    }
    public int getY()
    {
        return y;
    }
}
