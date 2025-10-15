package contacts;

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
    public void add (Contact p)
    {
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
        return null;
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
        return null;
    }
    public void supprimer (Contact c)
    {
        if (this.rechercheNom(c.getName()))
        {

        }
    }
}
