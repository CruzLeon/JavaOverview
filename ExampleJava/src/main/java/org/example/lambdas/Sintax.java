package org.example.lambdas;

/**
 * Las interfaces funcionales pueden ser definidas a nivel de clase o de miembro interno
 */
@FunctionalInterface
interface MyCustomFunctional {


    static void staticMethod() {
        System.out.println("Innner static method");
    }

    default String myImpl() {
        return "doit";
    }

    void doit();
}

@FunctionalInterface
interface FunctionalMoreParams {

    void doit(Integer a, String b, String... vargs);
}

@FunctionalInterface
interface FunctionalOneParams {

    void doit(Integer a);
}


public class Sintax {
    private static int myMmeber = 9;

    @FunctionalInterface
    private interface MyCustomInnerFunctional {
        static int miVariable = myMmeber;

        void doit();

        default void mymthod() {
            System.out.println(miVariable);
        }
    }

    public void doit(MyCustomFunctional functional) {
        functional.doit();
        functional.myImpl();
        MyCustomFunctional.staticMethod();
    }

    public void doitMoreParams(String a, Integer b, FunctionalMoreParams moreParams, String... atgs) {
        System.out.println(atgs.length);
        moreParams.doit(b, a, atgs);
    }

    public static void doitOneParams(Integer a, FunctionalOneParams ab){
        ab.doit(a);
    }
    public static void main(String[] args) {

        Sintax a = new Sintax();
        a.doit(() -> {
            System.out.println("MyMOTHER");
        });
        a.doit(() -> {return;});
        a.doitMoreParams("asd", 123, (Integer b, String ar, String... c) -> System.out.println(ar + b + c));
        Sintax.doitOneParams(13,  (at) -> System.out.println(at*at));
    }
}
