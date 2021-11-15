import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {

    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите назвние города");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Ведите 5 для получния погода на 5 деней;" + "Введите 0 для выхода.");

            String command = scanner.nextLine();
            if(command.equals("0")) break;


            controller.getWeather(command, city);










        }
    }
}
