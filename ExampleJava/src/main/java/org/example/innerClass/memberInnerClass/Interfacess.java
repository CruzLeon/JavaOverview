package org.example.innerClass.memberInnerClass;

 class InnerInterfacess {

    private interface MyPrivateInterface{
        /**
         * public static y final redundantes
         *
         * El compilador añade automaticamente public y abstract a todos los metodos no staticos y no default
         */
        public static final int mivalue=0;
        void doit();
    }

    public interface MyPublicInterface{
        void publicDoIt();
    }

    final class InnerClass implements MyPrivateInterface,MyPublicInterface{

        @Override
        public void doit() {

        }

        @Override
        public void publicDoIt() {

        }
    }
}

public  class Interfacess implements InnerInterfacess.MyPublicInterface {

    public static void main(String[] args) {

    }

    @Override
    public void publicDoIt() {

    }
}



