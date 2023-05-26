import java.util.Map;
import java.util.Scanner;

public class Game {


    public static void game(Map<Integer, String> answers) {

        System.out.println("Добро пожаловать в мини игру, волшебный шар №8");
        System.out.println("Нажмите Y - для начала или N - для завершения");
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        if (enter.equals("y") || enter.equals("Y") || enter.equals("н") || enter.equals("Н")) {
            if (!enter.isEmpty()) {
                Functional.addMap(answers);
                System.out.print("Магический шар говорит: ");
                Functional.choice(answers);

            }
        } else if (enter.equals("n") || enter.equals("N") || enter.equals("т") || enter.equals("Т")) {
            System.out.println("Завершение игры!");
        } else {
            System.out.println("Вы использовали неверную букву, просьба повторить");
            System.out.println("-----------------------------------");
            game(answers);

        }

    }
}
