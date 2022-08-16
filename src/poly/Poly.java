package poly;

class Animal {

    public void makeNoise() {
        System.out.println("iam just an animal");
    }
}

class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("woof woof!");
    }

    public void grow() {
        System.out.println("Grrrrrrr");
    }
}

public class Poly {

    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.makeNoise();
        Animal a = new Cat();
        print(a);
        Animal d = new Dog();
        print(d);

    }

    public static void print(Animal a) {
        if (a instanceof Dog) {
            a.makeNoise();
            ((Dog) a).grow();
        } else {
            a.makeNoise();
        }

    }

}
