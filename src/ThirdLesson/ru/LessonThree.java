package ThirdLesson.ru;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Угадайте число от 0 до 9");
            int range1 = 0;
            int range2 = 10;
            int random_number = range1 + (int) (Math.random() * range2);
            for (int i = 1; i <= 3; i++) {
                int number = scanner.nextInt();
                if (number == random_number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (number > random_number) {
                    System.out.println("Загаданное число меньше!");
                } else if (number < random_number) { //почему пишет что эта строка всегда true??
                    System.out.println("Загаданное число больше!");
                }
                if (i == 3) {
                    System.out.println("Вы проиграли, загаданное число = " + random_number);
                }
            }
            System.out.println("Хотите повторить? Введите 1, если хотите продолжить. Чтобы выйти нажмите 0");
            int lol = scanner.nextInt();
            if (lol == 1) {
                System.out.println("Начало новой игры!");
            } else if (lol == 0) {
                System.out.println("Конец");
                return;
            }
        }
    }
}
