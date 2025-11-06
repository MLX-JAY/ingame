package Counters;

public class LimiteAtteinteException extends Exception
{
    public LimiteAtteinteException (int nombre)
    {
        super("Limite atteinte : " + nombre);
    }
}
