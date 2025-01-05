public class Abstract {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
        h1.changeColor();
        System.out.println(h1.color);

        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();

        Mustang m1 = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    
    void walk() {
        System.out.println("walks on 2 legs");
    }
}