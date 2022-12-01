package uz.pdp.task2;

public class Main {
    public static void main(String[] args) {
        AddAttributes addAttributes = new AddAttributes();

        System.out.println(addAttributes.addAttributes(5,6));
        System.out.println(addAttributes.addAttributes(5, 6.5));
        System.out.println(addAttributes.addAttributes(2.1, 3.5, 4.0));
        System.out.println(addAttributes.addAttributes("Add", "Attributes"));
        System.out.println(addAttributes.addAttributes(5, "-dars"));


    }
}
