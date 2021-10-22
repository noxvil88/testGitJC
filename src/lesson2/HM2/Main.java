public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "1"},
                {"3", "1", "2", "4"},
                {"4", "3", "1", "2"}
        };
        int sum = 0;

        if (array.length != 4) throw new MyArraySizeException();
        if (array[0].length != 4) throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; i++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" Не число " + i + " , " + j);
                }
            }
        }

        System.out.println(sum);

    }
}
