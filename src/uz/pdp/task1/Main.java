package uz.pdp.task1;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();

        System.out.println(figure.area(4.5, 4));
        System.out.println(figure.area(4.5));

        System.out.println(Figure.perimetr(4.5, 4));
        System.out.println(Figure.perimetr(4.5));

        Figure.print(4.5, 4);
        Figure.print(4.5);

    }
}