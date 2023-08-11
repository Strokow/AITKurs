package homework10;
import java.util.Random;
import java.util.Scanner;


public class HomeWork10 {
    // task 0
    // Заполните массив 20 случайными целыми числами.
    // Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
    public static void main(String[] args) {
        int [] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println("Массив случайных чисел: ");
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();

        int evenCount = 0;
        int evenSum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
                evenSum += num;

            }
        }
        System.out.println("Количество чётных чисел: " +evenCount);
        System.out.println("Сумма чётных чисел: "+evenSum);

    }
    // task 1
    // За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    // Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
    // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
    // Для вычисления суммы с учетом процентов используйте цикл for.
    //
    //Пусть сумма вклада будет представлять тип float.
    //
    //Введите сумму вклада: 100
    //Введите срок вклада в месяцах: 1
    //После 1 месяцев сумма вклада составит 107,00

    public class BankDepositCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите сумму вклада");
            float initialAmount = scanner.nextFloat();

            System.out.println("Введите срок вклада в месяцах");
            int months = scanner.nextInt();

            float interestRate = 0.07f;
            for (int i = 1 ; i <= months ; i++ ) {

                initialAmount += initialAmount * interestRate;



            }
            System.out.printf("После %d месяцев сумма вклада составит %.2f%n", months, initialAmount);
            scanner.close();

        }


    }

}
