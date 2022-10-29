package org.example.creationalPatterns.builderPattern.innerPackage;

import org.example.creationalPatterns.builderPattern.Animal;

public class Run {
    public static void main(String[] args) {
        Animal a = new Animal.AnimalBuilder().setValue2(1).build();
        System.out.println(a);
    }
}
