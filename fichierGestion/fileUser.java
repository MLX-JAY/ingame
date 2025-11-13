package fichierGestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileUser 
{
    private String fileName;
    public fileUser (String fileName)
    {
        this.fileName=fileName;
    }
    public String readTxt ()
    {
        try
        {
            String phrase,resultat="";
            BufferedReader reader= new BufferedReader(new FileReader(fileName));
            while ((phrase=reader.readLine())!=null)
            {
                resultat+=phrase;
            }
            reader.close();
            return resultat;
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
        return "";
    }
    public void writeTxt (String text)
    {
        try
        {
            BufferedWriter writer= new BufferedWriter(new FileWriter(fileName));
            String[] tab=text.split("\n");
            for (int i=0;i<tab.length;i++)
            {
                writer.write(tab[i]+"\n");
            }
            writer.close();
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}

