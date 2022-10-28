package org.example.instanceOfOperator;

interface Parent{}
class Parent2{}
class AnotherChild implements Parent {}
public class Child extends Parent2{

    public static void main(String[] args) {

        //El operador instance of solo hace check en tiempo de compilacion cuando el segundo operando es una clase concreta

        AnotherChild anotherChild = new AnotherChild();
        Child child = new Child();
        Parent2 parent2 = new Parent2();
        Parent parent = new AnotherChild();
        boolean result;
        //Compilation error
        //boolean result = anotherChild instanceof Parent2;
        //result = parent2 instanceof  AnotherChild;

        result = parent2 instanceof Child;
        result = child instanceof Parent2; //Second operator check success
        result = anotherChild instanceof Parent; //Second operator is interface, does not check
        result = child instanceof Parent;

        //---
        //Cuando alguno de sus operandos es una interfaz no hace check en tiempo de compilacion.
        result = parent instanceof Parent2;
        result = parent instanceof AnotherChild;
        result = parent instanceof  Child;

        result = child instanceof  Parent;
        result = anotherChild instanceof  Parent;
        result = parent2 instanceof  Parent;


    }
}
