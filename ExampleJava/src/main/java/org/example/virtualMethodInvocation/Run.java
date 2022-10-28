package org.example.virtualMethodInvocation;

abstract class Animal {
    protected String name = "animalName";

    void callme() {
        System.out.println(name);
    }
}

class Lion extends Animal {
    String name = "Lion";

    @Override
    public void callme() {
        System.out.println(name);
    }
}

class Cat extends Animal{

    String name = "Cat";
}

class Panther extends Animal{

    @Override
    void callme() {
        super.name = "Panther";
        super.callme();
    }
}

class Tiger extends Animal{

    @Override
    void callme() {
        this.name = "Tiger";
        super.callme();
    }
}
public class Run {
    public static void main(String[] args) {

        /**
         * La invocacion virutal, en una jerarquia de herencia busca en el objeto de clase instanciado si este sobre escribe el metodo
         * definido por la clase, de ser asi invoca este metodo, en caso contrario ejecuta el de la clase padre con las
         * variables de instancia respectivas en el alcance dado
         *
         */

        Animal animal = new Lion();
        animal.callme();

        Animal cat = new Cat();
        cat.callme();

        Animal panther = new Panther();
        panther.callme();

        Animal tiger = new Tiger();
        tiger.callme();
    }
}
