package org.example.instanceOfOperator;
class Withouth{}
class Another{}
class SuperC extends Another{}
public class HierachyInstanceOf extends SuperC {

    public static void main(String[] args) {
        SuperC h = new SuperC();
        HierachyInstanceOf h1 = new HierachyInstanceOf();
        Another a = new Another();

        System.out.println(h instanceof SuperC);
        System.out.println(h instanceof HierachyInstanceOf);
        System.out.println(h1 instanceof SuperC);
        System.out.println(h1 instanceof HierachyInstanceOf);

        System.out.println(a instanceof HierachyInstanceOf);
        System.out.println(h instanceof  Another);

        System.out.println(new Withouth() instanceof Runnable);

        //Compilation error
        //System.out.println(new Withouth() instanceof  SuperC);

    }
}
