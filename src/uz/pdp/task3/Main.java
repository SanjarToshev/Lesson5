package uz.pdp.task3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3.5));
        System.out.println(calculator.sub(5.2, 2.1));
        System.out.println(calculator.multiply(6, 2));
        System.out.println(calculator.div(5, 2));
        System.out.println(calculator.abs(-456.5));
        System.out.println(calculator.pow(5));


    }
}
