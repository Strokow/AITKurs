package homework3;

public class IntegerNum2 {
    //Задача 1. Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
    // Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
    // Получается, у вас будет среднее арифметическое этих чисел в одной переменной. Распечатайте её через println.
    // Сколько программа отбросила в дробной части?

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int t = 8;
        int i = 9;
        int y = 10;

        int sum = (a + b + c + d + e + f + g + h + t + i);
        int average = (sum / y);
        System.out.println("Среднее арифметическое число :" +average);
        int discardedFraction = (sum % 10);
        System.out.println("Дробная часть :" +discardedFraction);

        //Задача 2. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        // Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
        // Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
        // Отдельно выведите на экран сумму скидки от этой покупки.

        int priceA = 1000;
        int priceB = 500;
        int summaryAmount = (priceA + priceB);
        int discount = 100;
        int totalPrice = (priceA + priceB - discount);
        System.out.println("Итоговая сумма покупки: " +totalPrice);
        int amountOfDiscount = (summaryAmount - totalPrice);
        System.out.println("Сумма скидки: " +amountOfDiscount);


        //Задача 3. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
        // Вычислите среднюю температуру за неделю и выведете ее на печать.

        int monday = 30;
        int tuesday = 28;
        int wednesday = 28;
        int thursday = 24;
        int friday = 22;
        int saturday = 22;
        int sunday = 28;

        int sumDegree = (monday + tuesday + wednesday + thursday + friday + saturday + sunday);
        int averageTemperature = (sumDegree / 7);

        System.out.println("Средняя температура за неделю в Дрездене: " +averageTemperature);

        //Задача 5(*). int x = 3 Чему будет равно значение х после выполнения операции x += x++ ?
        // Проверьте свое предположение на практике.

        int x = 3;
        int summa1 = (x++);
        int summa2 = (x++);
        int summa3 = (summa1 += summa2);
        System.out.println("Итоговое значение x: " +summa3);



    }





}
