package Othello;

/**
 *
 * @author FATMA
 */
public class FatmaCilginPerson {

    public enum Gender {
        Male,
        Famale
    };
    public static int gid = 0;
    public int id;
    public String eMail;
    public String nameSurname;
    public String password;
    public String passworgAgain;
    public Gender gender;

    public FatmaCilginPerson() {
        this.id = FatmaCilginPerson.gid;
        FatmaCilginPerson.gid++;
    }

    @Override
    public String toString() {
        String values = "";

        values += this.id + "&";
        values += this.eMail + "&";
        values += this.nameSurname + "&";
        values += this.password + "&";
        values += this.gender + "&";

        return values;
    }
}
