package org.example.enums;


/**
 * Nose puede extender de un enum
 */

//    enum Another extends WeekDays{
//
//    }


enum WeekDays{
    MONDAY, THURSDAY, FRIDAY
}


public class Emums {

    /**
     * Los enums se comportan como clases anidadas asi que pueden ser parte de miembros de la clase root
     */
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    /**
     * No se pueden comparar enums con numeros enteros;
     */

    public void compare(){
        //Compilation Error
        //boolean result = WeekDays.FRIDAY == 1;
    }

    /**
     * Se puede comparar un String si existe en un enum con el metodo valueOf
     */

    void compare2(){
        //ILLegal argument RuntimeError in valueOf
        //boolean result = WeekDays.FRIDAY == WeekDays.valueOf("Monday");

        boolean result = WeekDays.FRIDAY == WeekDays.valueOf("MONDAY"); //Success
        System.out.println(result);
    }

    public static void main(String[] args) {
        Emums subject = new Emums();
        subject.compare2();
        
        //Los ordinales empiezan desde 0
        System.out.println(Flavors.VANILLA.ordinal());
    }

}
