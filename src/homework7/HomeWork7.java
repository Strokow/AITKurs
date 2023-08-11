package homework7;

import java.util.Random;
import java.util.Scanner;

public class HomeWork7 {
    // Task 1 (Использовать оператор switch)
    //
    //Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
    // выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
    // Если 6 или 7 – “Выходной”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7 ");

        int dayNum = scanner.nextInt();

        String dayOfWeek;

        switch (dayNum) {
            case 1:
                dayOfWeek = "Понедельник";
                break;

            case 2:
                dayOfWeek = "Вторник";
                break;

            case 3:
                dayOfWeek = "Среда";
                break;

            case 4:
                dayOfWeek = "Четверг";
                break;

            case 5:
                dayOfWeek = "Пятница";
                break;

            case 6:

            case 7:
                dayOfWeek = "Выходной";
                break;

            default:

                dayOfWeek = "Неверный номер дня";
                break;



        }
        System.out.println("Результат: " +dayOfWeek);





    }

    // Task 2 Реализовать с использованием switch Ваш ребенок принес оценку за контрольную работу по математике.
    // В школе 12 бальная система.
    // Запишите в переменную случайное число от 0 до 12.
    // ы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.
    // (записать в переменную)
    //
    //Если оценка от 10 до 12 баллов ->
    // Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час от 7 до 9 ->
    // Слова похвалы на экран + ко времени 45 минут от 4 до 6 -> Нейтральные слова + ко времени 15 минут 3 ->
    // Огорчитесь. Минус 30 минут ко времени оценка меньше ->
    // Трагедия. Сегодня ТВ смотреть запрещено
    //
    //Выведите на экран оставшееся на сегодня время для просмотра ТВ
    //
    //P.S. Реализовать с использованием switch

public class TVTime{
    public static void main(String[] args) {

        Random random = new Random();
        int grade = random.nextInt(13);

        int remainingTVTime = 45;

        switch (grade) {

            case 10:
            case 11:
            case 12:
                System.out.println("Отличная оценка");
                remainingTVTime += 60;
                System.out.println("Оставшееся время просмотра телека: " + remainingTVTime + " минут ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Хорошая оценка");
                remainingTVTime += 45;
                System.out.println("Оставшееся время просмотра телека: " + remainingTVTime + " минут ");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Удовлетворительно");
                remainingTVTime += 15;
                System.out.println("Оставшееся время просмотра телека: " + remainingTVTime + " минут ");
                break;
            case 3:
                System.out.println("Чё то плохенько");
                remainingTVTime -= 30;
                if (remainingTVTime < 0) {
                    remainingTVTime = 0;


                } else {
                    System.out.println("Оставшееся время просмотра телека" + remainingTVTime + " минут ");
                }
                break;
            default:
                System.out.println("Слишком плохая оценка! Сегодня без телека");
                remainingTVTime = 0;

                System.out.println("Оставшееся время просмотра телека: " + remainingTVTime + " минут ");
                break;



        }
    }
}

    }

