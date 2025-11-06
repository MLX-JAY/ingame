package contacts;
import java.lang.Exception;
public class ContactAlreadyExistsException extends Exception
{
    public ContactAlreadyExistsException (String phrase)
    {
        super ("le contact "+phrase+" existe deja ");
    }
    
}