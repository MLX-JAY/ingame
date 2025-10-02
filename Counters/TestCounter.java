package Counters;
public class TestCounter 
{
    public static void main(String[] args) 
    {
        Counter c = new CyclicCounter(0, 10);
        for (int i = 0; i < 20; i++) 
        {
            System.out.println(c);
            c.increment();
        }
        System.out.println("fine de la boucle 1\n");
        Counter c2 = new CyclicCounter(10, 10);
        for (int i = 0; i < 20; i++) 
        {
            System.out.println(c2);
            c2.decrement();
        }
    }
}
