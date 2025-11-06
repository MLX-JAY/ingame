package contacts;

public class Contact {
    private String mail;
    private String phone;
    private String name;
    public Contact(String mail, String phone, String name) 
    {
        this.mail=mail;
        this.phone = phone;
        this.name = name;
    }
    public String toString ()
    {
        return name+" "+mail+" "+phone + "\n ";
    }
    String getMail() 
    {
        return mail;
    }
    String getPhone() 
    {
        return phone;
    }
    String getName() 
    {
        return name;
    }
    public boolean equals (Object o)
    {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Contact contact=(Contact)o;
        return (contact.getName().equals(name) && contact.getMail().equals(mail) && contact.getPhone().equals(phone));
    }
}