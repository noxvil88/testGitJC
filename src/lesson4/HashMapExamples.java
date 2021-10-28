package lesson4;

public class HashMapExamples {

    public static void main(String[] args) {


        HashMap<Integer, String> passports = new HashMap<>();
        passports.put(1234, "Ирина");
        passports.put(2344, "АНдрей");
        passports.put(11234, "Антон");
        passports.put(12134, "Оксана");


        System.out.println(passports);

        for (Integer passportNum: passports.keySet()) {
            if (passportNum == 12134) {
                passports.remove(passportNum);
            }
            //System.out.println(passports.get(passportNum));
        }

        System.out.println(passports);
    }
}
