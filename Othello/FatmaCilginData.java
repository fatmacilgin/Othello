package Othello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FatmaCilginData {

    static ArrayList<FatmaCilginPerson> personList = new ArrayList<>();
    static ArrayList<Integer> idList = new ArrayList<>();

    public static String personTxtFileName = "personList.txt";

    public static boolean Login(String mail, String password) {
        //arrayliste kaydolan ve giriş sayfasında girilen mail ve şifre karşılaştırmasını yapan method.
        boolean isLogin = false;
        for (FatmaCilginPerson p : personList) {
            if (p.eMail.compareTo(mail) == 0 && p.password.compareTo(password) == 0) {
                isLogin = true;
                break;
            }
        }
        return isLogin;
    }

    public static void AddPerson(FatmaCilginPerson person) throws Exception {
        //kullanıcının daha önce kayıt olup olmadığını kontrol eden method.
        for (FatmaCilginPerson p : personList) {
            if (p.eMail.compareTo(person.eMail) == 0) {
                throw new Exception("this mail has been registered,please select another one!");
            }
        }
        personList.add(person);
    }

    public static void WritePersonListToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(personTxtFileName));

        for (FatmaCilginPerson person : personList) {
            String values = person.toString();
            writer.append(values + "\n");

        }
        writer.close();
    }

    public static void ReadFromFileToPersonList() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(personTxtFileName));
        String line = "";

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String[] values = line.split("&");
            FatmaCilginPerson readPerson = new FatmaCilginPerson();
            readPerson.id = Integer.parseInt(values[0]);
            readPerson.eMail = values[1];
            readPerson.nameSurname = values[2];
            readPerson.password = values[3];
            personList.add(readPerson);

        }
        reader.close();
    }
}
