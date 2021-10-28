package lesson4;

public class IteratorExamples {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        System.out.println(integers);

        for (Integer integer : integers) {
            if (integer == 3) {
                integers.remove(integer);
            }
        }

        System.out.println(integers);

        HashMap<String, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put("test1", 4);
        integerHashMap.put("test12", 4);
        integerHashMap.put("test13", 4);

        Iterator<Map.Entry<String, Integer>> iterator = integerHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            String data = iterator.next().getKey();
            System.out.println(data);
            if (data.equals("test12")) {
                iterator.remove();
            }
        }

        System.out.println(integerHashMap);
    }
}
