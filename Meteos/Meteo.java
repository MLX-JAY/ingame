package Meteos;
public class Meteo 
{
    private float[] data;
    public Meteo ()
    {
        data=new float [12];
    }
    public Meteo (float [] data)
    {
        data=new float [12];
        this.data=data.clone();
    }
    public float getMax ()
    {
        float max=data[0];
        for (int i=1;i<data.length;i++)
        {
            if (data[i]>max)
            {
                max=data[i];
            }
        }
        return max;
    
    }
    public float getMin ()
    {
        float min=data[0];
        for (int i=1;i<data.length;i++)
        {
            if (data[i]<min)
            {
                min=data[i];
            }
        }
        return min;
    }
}
