package org.example.enums;

enum Myvalues {

    MYVALUE1 {
        @Override
        public String mustImpemented() {
            return "miImplementation";
        }

        @Override
        void defaultMethod(Number a) {

        }
    },
    MYVALUE2 {
        @Override
        public String mustImpemented() {
            return "mi2Implementation";
        }
        @Override
        void defaultMethod(Number a) {

        }

        //No genera error de compilacion pero el metodo no se puede llamar en ningun lado
        public void myCustomMethod(){
            System.out.println("asd");
        }

    };

    abstract String mustImpemented();

    void defaultMethod(Number a) {
    }
}

public class OverrideEnumsMethods{

    public static void main(String[] args) {

    }
}

