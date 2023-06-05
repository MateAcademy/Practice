package hillel.lesson2;

import java.util.Arrays;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        int a = 2; // в разных областях памяти хранятся, нет методов Какие есть обертки? Примитив хранится в стеке
        // давате запустимся в дебагере, Integer@34536 - это просто значение ссылки

        Integer b = new Integer(2);
        Integer b2 = Integer.valueOf(2);

        System.out.println(a);
        System.out.println(b);
        //давайте посмотрим что инт представляет из себя внутри из дебагера?
        //в Integer есть много дополнительных методов для парсинга, для округления, для перевода в строку, для сравнения ?
        //в нутри любой обертки лежит примитив?
    }
}

class M {
    public static void main(String[] args) {
        Integer i1 = 100;  //автоупаковка
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        //в чем разница между сравнением по equals и == (двойное равно сравнивает ссылки между собой)
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i3 == i4);

        Human human1 = new Human();
        Human human2 = new Human();


        System.out.println(human1.equals(human2)); // что будет сравниваться через equals?

        //рассказать про то как сравнивать и про автоупаковку и автораспаковку
        if (i1 == i2.intValue()) {

        }

        int s = 20056;
        int s2 = 20056;
        System.out.println("s = s2:" + (s==s2));

        Integer r = 20056;

        System.out.println(s == r);
        System.out.println(s == r.intValue());  //автораспаковка


    }
}

class Human{}

class H {
    public static void main(String[] args) {
        byte b = 127; // -128 ... +127

        for (int i =0; i < 100; i++) {
            b++;
        }

        //System.out.println(5);

        //что будет выведено на экран, почему именно это? Байт занимает 8 бит, в которое запис число 128 = 2 в 7 степ 1 000 000 0
        //все ли умеют переводить в двоичную ? Как работают знаковые биты, как представлять в двоичной записи отрицательные числа

        //почему бы не всегда использовать абертки?

        //классные методы Integer.bitcount() он считает количество единиц в двоичной записи числа
        //13 = 1101
        Integer a = 13;
        System.out.println(Integer.bitCount(13));
        System.out.println(Integer.max(2, 5));
        System.out.println(Integer.min(8, 10));
        System.out.println(Math.max(8, 10));


        System.out.println(Integer.parseInt("10", 2));
        //спарси значение числа d и выведи на экран:
        String d = "1101";
        System.out.println(Integer.parseInt(d, 2));

        //много библиотек и апач
        //комментарии, ваш код должен быть написан так что бы он не нуждался в комментариях


        //строчный коммент,
        /*
        * очень сложный код ниже, вот такой большой
        * */

        /**
         * джава доки если вы свой код выкинете в опн сорс или как библиотека предосталяете другому
         */


        //строки
        String r = "Привет"; // массив байтов

        final char[] arr = {'a', 'b'};
        System.out.println(Arrays.toString(arr)); // я могу поменять любой элемент в массиве, финальная ссылка на массив а не на значение массива

        //рассказать про метод тустринг класса обджект и привести пример распечатать хьюмана (имя, рост, вес)

        String resalt = " Числа по порядку" ;

        for (int i = 0; i < 10000; i++) {
            resalt = resalt + " " + i + " ";  //cancat
        }
        System.out.println(resalt); // какие могут быть проблемы
        System.gc(); //

        //рассказать про стрингбилдер

        StringBuilder sb = new StringBuilder(" Числа по порядку");  // создается новый массив, да но новый экземпляр строки не создается, не происходит каждый раз создание обьекта
        for (int i = 0; i < 10000; i++) {
            sb.append(" ").append(i).append(" ");
        }
        System.out.println(sb); // какие могут быть проблемы

        //кто знает какой арифметической операции равносилен сдвиг влево на единицу 5<<1 это умножение на 2
        //13 101 <<1  11010 = 26

        //целое число делим на целое число = целое
        //стринг сделали неизменяемым, это удобно для многопоточной работы, это просто безопасно и быстрей(пулл стрингов)
        //Стрингбаффер - методы синхронизированы, безопасен в многопоточном приложении
        //Почитать про класс обджект и про неизменяемые обьекты.

        int e = 13;
        int e2 = 4;

        System.out.println((double) e/e2);
    }
}
