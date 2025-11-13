package contacts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class contactSaver 
{
    private String fileName;
    private String separator;
    public contactSaver (String fileName)
    {
        this.fileName=fileName;
    }
    public String readTxt ()
    {
        try
        {
            String phrase,resultat="",tab[];
            BufferedReader reader= new BufferedReader(new FileReader(fileName));
            while ((phrase=reader.readLine())!=null)
            {
                tab=phrase.split(separator);
                resultat+=tab[0]+" "+tab[1]+" "+tab[2]+"\n";
            }
            reader.close();
            return resultat;
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
        return "";
    }
    public void writeTxt (Repertoire repertoire)
    {
        try
        {
            BufferedWriter writer= new BufferedWriter(new FileWriter(fileName));
            String[] tab=text.split(separator);
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
