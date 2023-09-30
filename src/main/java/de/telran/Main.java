package de.telran;


public class Main {
    public static void main(String[] args){
    //  1 уровень сложности: № 1
    //Создайте строку через new - I study Basic Java!
    //Распечатать пред-последний символ строки. Используем метод String.charAt().
    //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    //Вырезать строку Java c помощью метода String.substring().
    //Заменить все символы “а” на “о”.
    //Преобразуйте строку к верхнему регистру.
    //Преобразуйте строку к нижнему регистру.


        String y = new String("I study Basic Java!");
        System.out.println(y.charAt(17));

        System.out.println(y.contains("Java"));
        System.out.println(y.substring(14, 18));

        System.out.println(y.replace("a","o"));

        System.out.println(y.toUpperCase());
        System.out.println(y.toLowerCase());




                //Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль


        System.out.println(minus(10, 6));

        System.out.println(plus(10, 6));

        System.out.println(mult(10, 6));

        System.out.println(divide(10, 6));
    }

    public static int minus(int x, int y){
        return x - y;
    }

    public static int plus(int x, int y){
        return x + y;

    }

    public static int mult(int x, int y) {
        return x * y;

    }
        public static int divide(int x, int y) {
        return x / y;
        }
}