package homework8;

import java.util.Scanner;

public class HomeWork8 {

 // task 1
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
           System.out.println("Task" + i);
            i++;

       }

    }

  //   task 2

    public class DivisibleByFive {
        public static void main(String[] args) {
            int number = 1;
            do {
                if (number % 5 == 0) {
                    System.out.println(number);
                }
                number++;

                } while (number <= 100);

            }

    }
    // task 3

    public class HelloChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String ourWord = ("Hello");
            String inputWord;


            do {
                System.out.print("Введите слово 'hello': ");
                inputWord = scanner.nextLine();
            } while (!inputWord.equalsIgnoreCase(ourWord));

            System.out.println("Спасибо за правильное слово!");
        }

    }
    }



