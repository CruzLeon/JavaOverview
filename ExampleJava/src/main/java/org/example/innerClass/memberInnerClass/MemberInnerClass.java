package org.example.innerClass.memberInnerClass;

/**
 * Una clase anidada que no es estatica es llama tambien inner class (Clase interna)
 */

import java.io.Serializable;

/**
 * 4 tipos de clases
 *
 * Clase interna, definida al mismo nivel de las variables de instancia (member inner class)
 * Clase local interna, definida a nivel de metodo
 * Clase anonima interna, definida a nivel de metodo pero sin nombre
 * Clase inerna statica (nested), definida al mismo nivel de las variables estaticas
 */
public class MemberInnerClass {

    private int miVariable = 0;
    private static int secondVariable = 1;

    /**
     * Member Inner class (Clase inerna miembro)
     */
    /**
     * pueden ser publicas, protected, package default y privadas
     */
    public class MemberInnerClass1{}
    protected class MemberInnerClass2{}
    class MemberInnerClass3{}
    private class MemberInnerClass4{}

    /**
     * Pueden extender de cualquier clase e implementar interfaces
     */
    private class MemberInnerClass5 extends MemberInnerClass1 implements Serializable{}

    /**
     *  Pueden ser abstractas o finales
     */
    protected abstract class MemberInnerClass6{}
    private final class MemberInnserClass7{}

    /**
     * NO pueden declarar campos estaticos o metodos estaticos
     */

    public final class MemberInnerClass8{
        //Compilation error
        //static int myNumber;

        //Compilation error
        //static void doit(){}
    }

    /**
     * Pueden acceder a miembros de la clase externa incluso si estos son privados
     */

    private class MemberInnerClass9{

        int miVariableInterna = miVariable;
        int miSegundaVariable = secondVariable;

        public void dosadfd(){
            MemberInnerClass.this.miVariable = 78;
        }
    }

    /**
     * Solo se pueden crear objetos de la clase miembro interna desde un contexto tambien de miembro/variable
     */
    public void memberMethod(){
        new MemberInnerClass9();
    }

    /**
     * Desde un contexto estatico produce error de compilacion si se instancia de una
     * Si se instancia desde una referencia root ya creada no produce error
     */
    public static void staticMethod(){
        //Compilation error
        //new MemberInnerClass9();
        MemberInnerClass root = new MemberInnerClass();
        MemberInnerClass9 var = root.new MemberInnerClass9();
    }

    public static void main(String[] args) {

    }
}

class Another{

    public void doit(){
        MemberInnerClass root = new MemberInnerClass();
        //MemberInnerClass.MemberInnerClass9 no se puede acceder a una clase interna miembro privada desde otra clase
    }
}