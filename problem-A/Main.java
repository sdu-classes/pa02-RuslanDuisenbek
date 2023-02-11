
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        System.out.println(animal);
        Mammal mammal = new Mammal("Camel");
        System.out.println(mammal);
        Cat cat = new Cat("Loki");
        cat.greets();
        System.out.println(cat);
        Dog dog1 = new Dog("Boribasar");
        dog1.greets();
        Dog another = new Dog("aqtos");
        dog1.greets(another);
        System.out.println(dog1);

    }
}
