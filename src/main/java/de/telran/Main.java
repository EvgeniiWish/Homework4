package de.telran;


public class Main {




    public static void main(String[] args){
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