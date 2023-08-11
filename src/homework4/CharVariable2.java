package homework4;

public class CharVariable2 {
    public static void main(String[] args) {
        //Task 01
        //
        //Создайте переменную с типом String, в которой будет хранится ВАше имя.
        //Сколько букв в вашем имени? Выведите значение на экран
        //Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
        //Выведите на экран десятичный код первого и последнего символа вашего имени

        // Создаем переменную с типом String и сохраняем в ней имя "Alexej"
        String name = "Alexej";

        // Выводим количество букв в имени
        int nameLength = name.length();
        System.out.println("Количество букв в имени: " + nameLength);

        // Создаем две переменные типа char и присваиваем им первый и последний символы имени
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(nameLength - 1);

        // Выводим десятичный код первого и последнего символа имени
        int firstCharCode = (int) firstChar;
        int lastCharCode = (int) lastChar;
        System.out.println("Десятичный код первого символа: " + firstCharCode);
        System.out.println("Десятичный код последнего символа: " + lastCharCode);

        // Task 02 Создайте строки:
        //
        //"Java"
        //"is"
        //"a"
        //"powerful"
        //"language"
        //Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"
        //
        //Распечатать эту строку и ее длину

        // Создаем строки
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        // Способ 1: С помощью оператора "+"
        String result1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Способ 1: " + result1);
        System.out.println("Длина строки: " + result1.length());

        // Способ 2: С помощью метода concat()
        String result2 = str1.concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(" ").concat(str5);
        System.out.println("Способ 2: " + result2);
        System.out.println("Длина строки: " + result2.length());
    }
}
