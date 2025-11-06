package Counters;

public class Counter 
{
    private int value;
    public Counter (int value)
    {
        this.value=value;
    }
    public void increment () 
    {
        value++;
    }
    public void decrement ()
    {
        if (value>0)
        {
            value--;
        }
        
    }
    public String toString ()
    {
        return ""+value;
    }
    public int getValue ()
    {
        return value;
    }
    protected void setValue (int value)
    {
        this.value=value;
    }
}
