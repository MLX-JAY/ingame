package fichierGestion;

public class test 
{ 
    public static void main(String[] args) 
    {
        fileUser fichier = new fileUser("test.txt");
        String txt;
        txt="je suis un test\n je n'aime pas les erreurs \n un bon test";
        fichier.writeTxt(txt);
        System.out.println(fichier.readTxt());
    }
}
