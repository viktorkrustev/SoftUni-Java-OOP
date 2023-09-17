package InheritanceLab.SingleInheritance_01;

import InheritanceLab.HierarchicalInheritance_02.Cat;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Cat cat = new Cat();
        cat.meow();
    }
}
