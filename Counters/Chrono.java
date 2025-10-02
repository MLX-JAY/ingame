package Counters;
public class Chrono 
{
    private CyclicCounter h;
    private CyclicCounter m;
    private CyclicCounter s;
    public  Chrono() 
    {
        h=new CyclicCounter(0,23);
        m= new CyclicCounter(0,59);
        s = new CyclicCounter(0,59);
    }
    private String convert (int element)
    {
        if (element <10)
        {
            return "0"+String.valueOf(element);
        }
        return String.valueOf(element);
    }
    public String toString() 
    {
        String heure,minute,seconde;
        heure=convert(h.getValue());
        minute=convert(m.getValue());
        seconde=convert(s.getValue());
        return heure + ":" + minute + ":" + seconde;
    }
    public void increment ()
    {
        if (s.getValue()==59)
        {
            if (m.getValue()==59)
            {
                h.increment();
            }
            m.increment();
        }
        s.increment();
    }
    public void decrement ()
    {
         if (s.getValue()==0)
        {
            if (m.getValue()==0)
            {
                h.decrement();
            }
            m.decrement();
        }
        s.decrement();
    }
}
