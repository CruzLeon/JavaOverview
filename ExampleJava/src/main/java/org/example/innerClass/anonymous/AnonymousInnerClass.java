package org.example.innerClass.anonymous;

/**
 * Una clase anonima interna es una clase local que no tiene nombre
 *
 * Estas son declaradas e instanciadas en una sola setencia haciendo uso del operador new
 */
public class AnonymousInnerClass {

    private interface Myinte{
        void doit();
    }

    public Myinte doit(){
        //CLase anonima interna
        return new Myinte() {
            @Override
            public void doit() {
                System.out.println("something");
            }
        };
    }

    public void doit2(Myinte myinte){
            myinte.doit();
    }

    /**
     * PARAMETROS EN METODOS con instancias anonimas
     */
    public void method(){
        doit2(new Myinte() {
            @Override
            public void doit() {
                System.out.println("SOMETHING");
            }
        });
    }
}
