package org.example.creationalPatterns.builderPattern.innerPackage;

import org.example.creationalPatterns.builderPattern.Animal;


interface HouseObject{

    void doIt();
}

class Sofa implements HouseObject{


    @Override
    public void doIt() {
        System.out.println("Sofa doit");
    }
}

class Computer implements HouseObject{

    @Override
    public void doIt() {
        System.out.println("Computer doit");
    }
}

public class HouseFactory {

    private HouseFactory(){};

    public static final HouseObject getObject(String type){
        switch (type){
            case "1": return new Computer();
            case "2": return new Sofa();
            default: throw new UnsupportedOperationException("typ not support");
        }

    }
    public static void main(String[] args) {
        HouseObject comp = HouseFactory.getObject("1");
        comp.doIt();
        HouseObject sofa = HouseFactory.getObject("2");
        sofa.doIt();
    }
}
