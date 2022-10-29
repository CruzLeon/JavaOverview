package org.example.lambdas;
import java.util.function.Predicate;
public class PredicateTest {

    public static void doit(Predicate<Integer> predicate){
        System.out.println(predicate.test(123));
    }

    public static void main(String[] args) {
        PredicateTest.doit((a)->a==123 ? true : false);
    }
}
