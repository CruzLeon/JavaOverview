package org.example.innerClass.memberInnerClass;

 class InnerInterfacess {

    private interface MyPrivateInterface{
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



