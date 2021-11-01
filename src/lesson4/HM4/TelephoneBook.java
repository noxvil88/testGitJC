import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {

    private HashMap<String, ArrayList<String>> telephoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = telephoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        telephoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return telephoneBook.get(lastName);
    }

    public static void main(String[] args) {
        TelephoneBook phoneBook = new TelephoneBook();
        phoneBook.add("Петров", "9123843");
        phoneBook.add("Смирнов", "9212837");
        phoneBook.add("Алексеев", "9048149");
        phoneBook.add("Макаров", "9003283");
        phoneBook.add("Дмитриев", "9813723");
        phoneBook.add("Петров", "9436577");
        phoneBook.add("Козлов", "9412384");
        phoneBook.add("Николаев", "9732143");

        System.out.println(phoneBook.get("Петров"));
    }
}
