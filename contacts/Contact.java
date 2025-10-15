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
}