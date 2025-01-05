public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }   
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

class Mammal extends Animal {
    int legs;

    void walks() {
        System.out.println("walks");
    }
}

class Birds extends Animal {
    int legs;

    void fly() {
        System.out.println("fly");
    }
}

class Dog extends Mammal {
    String breed;
}