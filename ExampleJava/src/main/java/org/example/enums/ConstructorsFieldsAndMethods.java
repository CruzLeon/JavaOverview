package org.example.enums;

enum SpecializedEnum {
    /**
     * El punto y coma es requerido si hay mas cosas aparte de los valores constantes
     */

    /**
     * Para cada valor del enum solo se llama el contructor 1 vez, al llamar por primera vez el valor del enum
     */
    HOUSE("100M"),APARTMENT("50M");


    private String space;
    public static String anotherVariable = "Asd";
    /**
     * El constructor de un enum no puede ser publico, por defecto es privado
     */
    private SpecializedEnum(String space) {
        System.out.println("Constructing");
        this.space = space;
    }

    public String getSpace(){
        return space;
    }

    public static String getAnotherVariable(){
        return anotherVariable;
    }
}

public class ConstructorsFieldsAndMethods {

    public static void main(String[] args) {
        /**
         * Para llamar el metodo de un enum, si no es estatico debe ser con un valor previo del enum
         */

        //Compilation error
        //SpecializedEnum.getSpace();

        SpecializedEnum.APARTMENT.getSpace(); //Success

        SpecializedEnum.getAnotherVariable(); //Success


        SpecializedEnum.HOUSE.getSpace();

        //Does not call constructor again
        SpecializedEnum.HOUSE.getSpace();


    }
}
