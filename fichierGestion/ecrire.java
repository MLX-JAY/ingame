package fichierGestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ecrire
{
    public static void main (String []args )
    {
        try 
        {
            BufferedWriter writer=new BufferedWriter(new FileWriter("hello.txt"));
            writer.write("helloooooooooooooooooooooooooo");
            writer.close();
            BufferedReader reader= new BufferedReader(new FileReader("hello.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }

}
