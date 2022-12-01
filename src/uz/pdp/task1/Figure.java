package uz.pdp.task1;

public class Figure {


    public Figure() {
    }

    static final double pi = Math.PI;

    public static double area(double a, double b){
        return a*b;
    }
    public static double area(double a){
        return (pi*(a*a)) ;
    }

    public static double perimetr(double a, double b){
        return 2*(a+b);
    }
    public static double perimetr(double a){
        return 2*(pi*a);
    }

    public static void print(double a, double b){
        System.out.println(a+" "+b);
    }
    public static void print(double a){
        System.out.println(a);
    }

}
