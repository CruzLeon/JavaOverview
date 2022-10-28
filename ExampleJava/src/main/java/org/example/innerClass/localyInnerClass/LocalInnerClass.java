package org.example.innerClass.localyInnerClass;

/**
 * Una declaracion de clase local no existe si no hasta el metodo es invocado, y queda fuera de alcance cuando
 * el metodo retorna
 */

/**
 * No tienen un especificador de acceso
 * NO pueden ser declaradas static y no pueden tener metodos estaticos
 * Al igual que con las clases inner, tienen acceso a todos los miembros de la clase root, no importa si estos son finales o no
 *
 * No tienen acceso a las variables locales del metodo a menos que estas sean "efectivamente local"
 *
 * Efectivamente local se puede entender cuando la asignacion ocurre unicamente una sola vez, independentemente si es
 * con base a una decision o no
 */
public class LocalInnerClass {
    int b = 9;
    void doit(){
        b=7;
        final int y = 9;
        final int g;
        g = 8;
        int u = 9;
        u = 0;
        class MyLocalInnerClass{
            int x = 9;

            void doit(){
                System.out.println(b);
                System.out.println(y);
                System.out.println(g);
                //Compilation error la variable u no es final ni efectivamente final
                //System.out.println(u);
            }
        }
        MyLocalInnerClass a = new MyLocalInnerClass();
        System.out.println(a.x);
    }

    void comError(){
        //No permite especificadores de acceso
        //public class MyClass{}

    }

    public static void main(String[] args) {
        //Compilation Error solo existe hasta que el metodo se invoca, solo existe en el ambito del metodo
        //MyLocalInnerClass a = null;

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.doit();
    }

}
