package homework5;

import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(21); // Генерация случайного числа от 0 до 20

            boolean isEven = number % 2 == 0;
            boolean isMultipleOf3 = number % 3 == 0;

            System.out.printf("Число: %d четное: %b, кратно 3: %b, четное и кратное 3: %b%n",
                    number, isEven, isMultipleOf3, isEven && isMultipleOf3);
        }
    }
}
