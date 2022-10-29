package org.example.innerClass.staticInnerClass;

public class Browsers {

    static interface myInterface{

    }
    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }

    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }

    /**
     * El modificador final se puede usar en la sobreescritura de metodos
     */
    static class IE extends Browser {
        @Override
        public final void go() {
            System.out.println("Inside IE");
        }
    }

    public static void main(String[] args) {
        Browser b = new Firefox();
        Integer a = new Integer("1");
        b.go();
    }
}