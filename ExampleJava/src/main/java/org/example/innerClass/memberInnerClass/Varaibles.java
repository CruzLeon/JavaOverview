package org.example.innerClass.memberInnerClass;

class Test {

    int x = 20;

    class InnerOne{
        int x = 10;
        int y = 10;

        class InnerTwo{
            int x = 0;

            /**
             * Para acceder a variables externas con el mismo nombre se usa la anotacion Clase.this.variable
             */
            void doit(){
                System.out.println(x);
                System.out.println(y);
                System.out.println(InnerOne.this.x);
                System.out.println(Test.this.x);
            }

        }
    }
}

public class Varaibles {

    public static void main(String[] args) {
        Test test = new Test();
        Test.InnerOne innerOne = test.new InnerOne();
        Test.InnerOne.InnerTwo innerTwo = innerOne.new InnerTwo();

        innerTwo.doit();
    }
}
