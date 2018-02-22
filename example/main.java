package example;

import java.io.*;
/**
 * Created by Василий on 05.06.2017.
 */
public class main {
    public static void main (String[] args) throws IOException
    {

//-------------БЛОК СОЗДАНИЯ ПЕРЕМЕННЫХ-----------

        String stroka;
        // создание переменной "x" типа Инт
        int x;

        // создание переменной символ в кодировке utf-16
        char l = '!';// char l = '\u0021';

        //создание перемменной целого числа в десятичной кодировке и шеснадцатиричной
        int x1 = 31;
        int x11 = 0x1f;
        long x12 = 200L;// если явно не указать тип переменной при присваивание произойдет обрезание типа до инт

        // преобразование строки в число
        int t = Integer.parseInt("123");

        // создание переменной с плавающей точкой
        double z = 1.5;

        // Логическое И

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 && b2;

        // Логическое ИЛИ
        b3 = b1 || b2;

        // Логическое НЕ
        b3 = !b1;

        // Логический XOR
        b3 = b1^b2;

        //Операция сравнения двух переменных на равенство(!= не равно, >= больше равно, <= меньше равно)
        b3 = (b1 == b2);

        //создание рандомной переменной от 0 до 100
        //int r;
        //Random r = new Random;
        //r.nextInt(100);

//-------------БЛОК ЧТЕНИЯ ПЕРЕМЕННЫХ--------------------

        // чтение из консоли строки

        // создание буферезированного ридера
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in) );
		/*создание буффера ввода стандартного потока ввода, зависит от стандартной процедуры чтения строки.
		дальше производим чтение таким оброзом String s = reader.readLine(); */


//-------------БЛОК ВЫВОДА ПЕРЕМЕННЫХ---------------------------

        // простой вывод
        System.out.println("Hello, world!");



        System.out.println("Введи что-нибудь");
        String s = reader.readLine();
        System.out.println("Ввели :"+s);

        // Форматируемый Вывод
        System.out.printf("Подставим переменную S= %s\n", s);

        // Вывод с использованием симола экранирования
        // %4s - строка занимает 4 символа, если переменная меньше, то дополняется пробелами
        System.out.printf("Подставим переменную \"S\"= %4s\n", s);// %g - для вывода переменной типа double

//-------------БЛОК СОЗДАНИЯ ЭКЗЕМПЛЯРОВ КЛАССА---------------------

        //работа с строкой
        String hello = "Привет";
        String name = "Андрей";
        StringBuilder sb = new StringBuilder();


		/*добавление строк в буфер*/
        sb.append(hello);
        sb.append(" ");
        sb.append(name);
		/*возврат буфера*/
        System.out.println(sb.toString());

//-------------------БЛОК МАТЕМАТИЧЕСКИХ ОППЕРАЦИЙ--------------------------

        // преобразование строки в вещ число
        Double a = Double.parseDouble(reader.readLine());
        System.out.println(a);
        //возведение числа в степень
        a = Math.pow(a, 2);
        // извлечение корня
        a = Math.sqrt(a);
        //возвращаем остаток от деления на 10
        a = a % 10;

//-----------Условный оператор

        if (a > 0)
        {
            s = "а больше нуля";
        }
        else
        {
            s = "а меньше нуля";
        };



//-----------то же самое что и if
        s = ( a > 0) ? "а больше нуля" : "а меньше нуля";

        int a1 = 11;

        switch(a1)
        {
            case 0:// Будет срабатывать как для 0 так и 1
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            default:
                System.out.println("Не смогла");
        }

        // проверка на пустую строку
       // String stroka;
        //if (stroka.isEmpty()) System.out.println("Stroka pysta");

//-------------Оператор цыкла

        for (int i=0; i < 10; i++)
        {
            if (i == 3) continue;
            if (i == 7) break;
            System.out.println(i+1);
        };


        int i = 1;
        while ( i < 100)
        {
            System.out.println(i+1);
            i *= 2;
        }

/*        do

        {
            System.out.println(i+1);
            i *= 2;
        };

        //while (i<100) do {};
        */
    }


}