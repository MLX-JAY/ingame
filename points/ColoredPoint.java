package points;

public class ColoredPoint extends Point {
    private String color;
    public ColoredPoint(int x,int y , String color)
    {
        super(x,y);
        this.color=color;
    }
    public String getcolor()
    {
        return color;
    }
    public void setcolor(String color)
    {
        this.color=color;
    }
    public String toString()
    {
        return "("+super.getX()+","+super.getY()+")"+color;
    }
}
