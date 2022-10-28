package org.example.enums;

enum Values {
    VALUE1, VALUE2
}

public class UsingEnums {

    public static void main(String[] args) {

        /**
         * Enums in switch
         */
        Values value = Values.VALUE1;
        switch (value) {

            //Compilation error
//            case Values.VALUE1:
//                break;

            case VALUE1:
                System.out.println(Boolean.TRUE);
                break;

            //Error de compilacion no se puede comparar enums con ints
//            case 2:
//                System.out.println("error");
//                break;
        }


        switch (value.ordinal()) {
            case 1:
                System.out.println("Con ints");
                break;
        }
    }
}
