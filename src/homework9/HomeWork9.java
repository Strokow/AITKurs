package homework9;
import java.util.Random;

public class HomeWork9 {
    // task 1
    // Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
    //
    //Вывести на экран:
    //
    //минимальное значение, хранящееся в массиве
    //максимальное
    //среднее арифметическое всех значений в массиве



    public class ArrayStatistics {
        public static void main(String[] args) {
            // Выберите произвольную длину массива (например, 10)
            int length = 10;
            int[] array = new int[length];

            // Заполнение массива случайными значениями
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(100); // Предполагаем диапазон случайных чисел от 0 до 99
            }

            // Выводим массив на экран (для наглядности)
            System.out.print("Массив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Вычисляем минимальное значение в массиве
            int min = array[0];
            for (int i = 1; i < length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            // Вычисляем максимальное значение в массиве
            int max = array[0];
            for (int i = 1; i < length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            // Вычисляем среднее арифметическое всех значений в массиве
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            double average = (double) sum / length;

            // Выводим результаты на экран
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее арифметическое: " + average);
        }
    }

}
