
public class Mainn {
    public static void main(String[] args) {


        Circle c1 = new Circle(5.5 , "red" , false);                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());



        Rectangle r1 = new Rectangle(3.8 , 2.5 , "green" , false);   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());


        Square sq1 = new Square(6.6);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());

    }
}
