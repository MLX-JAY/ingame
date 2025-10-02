package Counters;

public class BoundedCounter extends Counter {
    private int max;
    public BoundedCounter(int value, int max) 
    {
        super(value);
        this.max = max;
    }
    public int getMax() 
    {
        return max;
    }
    public void increment() 
    {
        
        if (getValue() < max) 
        {
            super.increment();
        }
    }
}
