package contacts;
import java.util.NoSuchElementException;
public class Repertoire 
{
    private Contact tab [];
    private int size=0;
    public Repertoire (int taille)
    {
        tab=new Contact [taille];
    }
    public String toString ()
    {
        StringBuilder temp=new StringBuilder("le repertoire est compose de : \n");
        for (int i=0;i<size;i++)
        {
            temp.append(tab[i].toString()+"\n");
        }
        return temp.toString();
    }
    public void add (Contact p) throws ContactAlreadyExistsException
    {
        
        for (int i=0;i<tab.length;i++)
        {
            if (tab[i].equals(p))
            {
                throw new ContactAlreadyExistsException(tab[i].getName());
            }
        }
        if (size<tab.length)
        {
            tab[size]=p;
            size++;
        }
    }
    public Contact rechercheNom (String nom)
    {
        int i=0;
        while ( i<size)
        {
            if (tab[i].getName().equals(nom))
            {
                return tab[i];
            }
        }
        throw new NoSuchElementException(nom);
    }
    public Contact rechercheTelephone (String telephone)
    {
        int i=0;
        while ( i<size)
        {
            if (tab[i].getPhone().equals(telephone))
            {
                return tab[i];
            }
        }
        throw new NoSuchElementException(telephone);
    }
    public void supprimer (Contact c)
    {
        if (rechercheNom(c.getName())!=null)
        {
            for (int i=0;i<size;i++)
            {
                if (tab[i].equals(c))
                {
                    tab[i]=tab[size-1];
                    size--;
                }
            }
        }
    }
}
