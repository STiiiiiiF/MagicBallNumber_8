
import java.util.Map;
import java.util.Random;

public class Functional {

        public static void addMap(Map<Integer, String> map) {
        map.put(1, "Бесспорно");
        map.put(2, "Предрешено");
        map.put(3, "Никаких сомнений");
        map.put(4, "Определённо да");
        map.put(5, "Можешь быть уверен в этом");
        map.put(6, "Мне кажется — \"да\"");
        map.put(7, "Вероятнее всего");
        map.put(8, "Хорошие перспективы");
        map.put(9, "Знаки говорят — \"да\"");
        map.put(10, "Да");
        map.put(11, "Пока не ясно, попробуй снова");
        map.put(12, "Спроси позже");
        map.put(13, "Лучше не рассказывать");
        map.put(14, "Сейчас нельзя предсказать");
        map.put(15, "Сконцентрируйся и спроси опять");
        map.put(16, "Даже не думай");
        map.put(17, "Мой ответ — \"нет\"");
        map.put(18, "По моим данным — \"нет\"");
        map.put(19, "Перспективы не очень хорошие");
        map.put(20, "Весьма сомнительно");

    }

    public static void choice(Map<Integer, String> answers) {
        boolean firstChoice = true;
        while (firstChoice) {
            for (Map.Entry<Integer, String> entry : answers.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                Random random = new Random();
                int int_random = random.nextInt(19 + 1) + 1;
                if (int_random == key) {
                    System.out.println(value);
                    firstChoice = false;
                    break;
                }
            }

        }
    }

}

