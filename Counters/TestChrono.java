package Counters;

public class TestChrono 
{
    public static void main(String[] args) 
    {
        Chrono c = new Chrono();
        for (int i = 0; i < 20; i++) 
        {
            c.increment();
        }
        System.out.println(c);
        System.out.println("fine de la boucle 1\n");
        for (int i = 0; i < 20; i++) 
        {
            c.decrement();
        }
        System.out.println(c);
        for (int i=0;i<6000;i++)
        {
            c.increment();
        }
        System.out.println(c);
    }
    
}
