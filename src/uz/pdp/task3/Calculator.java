package uz.pdp.task3;

import uz.pdp.task1.Main;

public class Calculator {

    //1) istalgan toifadagi ikkita sonni yig'indisini qaytaradigan (add) methodi.
    //2) istalgan toifadagi ikkita sonni ayirmasini qaytaradigan (sub) methodi.
    //3) istalgan toifadagi ikkita sonni ko’paytmasini qaytaradigan (multiply) methodi.
    //4) istalgan toifadagi ikkita sonni bo’linmasini qaytaradigan (div) methodi.
    //5) istalgan toifadagi bitta sonning absolyut qiymatini qaytaradigan (abs) methodi.
    // 6) istalgan toifadagi bitta sonning kvadrat qiymatini qaytaradigan (pow) methodi.


    public Calculator() {
    }

    //add
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(int a, double b){
        return a+b;
    }
    public static double add(double a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static long add(long a, long b){
        return a+b;
    }
    public static double add(double a, long b){
        return a+b;
    }
    public static double add(long a, double b){
        return a+b;
    }

    //sub
    public static int sub(int a, int b){
        return a-b;
    }
    public static double sub(int a, double b){
        return a-b;
    }
    public static double sub(double a, int b){
        return a-b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static long sub(long a, long b){
        return a-b;
    }
    public static double sub(double a, long b){
        return a-b;
    }
    public static double sub(long a, double b){
        return a-b;
    }


    //multiply
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double multiply(int a, double b){
        return a*b;
    }
    public static double multiply(double a, int b){
        return a*b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static long multiply(long a, long b){
        return a*b;
    }
    public static double multiply(double a, long b){
        return a*b;
    }
    public static double multiply(long a, double b){
        return a*b;
    }

    //div
    public static double div(int a, int b){
        return a/b;
    }
    public static double div(int a, double b){
        return a/b;
    }
    public static double div(double a, int b){
        return a/b;
    }
    public static double div(double a, double b){
        return a/b;
    }
    public static double div(long a, long b){
        return a/b;
    }
    public static double div(double a, long b){
        return a/b;
    }
    public static double div(long a, double b){
        return a/b;
    }

    //abs
    public static int abs(int a){
        return Math.abs(a);
    }
    public static double abs(double a){
        return Math.abs(a);
    }
    public static long abs(long a){
        return Math.abs(a);
    }

    //pow
    public static int pow(int a){
        return a*a;
    }
    public static double pow(double a){
        return a*a;
    }
    public static long pow(long a){
        return a*a;
    }




}
