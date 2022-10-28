package org.example.packageVisibility;

/**
 * Hello world!
 */
public class App {

    public static <T extends String> void doit(String a, T t) {
        System.out.println("doit " + a + " " + t.getClass().getName());
    }


    public static void main(String[] args) {

        App.<String>doit("asd","23");
        System.out.println("Hello World!");
    }
}
