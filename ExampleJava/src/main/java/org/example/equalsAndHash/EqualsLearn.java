package org.example.equalsAndHash;

import java.util.Objects;

public class EqualsLearn {

    int id;
    int anotherId;
    /**
     * Propiedades para un metodo equals
     *
     *      Tiene que ser reflexivo para cualquier referencia no null, esto es:
     *
     *              x == x --> true
     *              x.equals(x) --> true
     *
     *      Tiene que ser simetrica esto es:
     *
     *              x==y -->true entonces y == x --> true
     *
     *      Transitiva:
     *
     *          x==y -->true , x == z -->true, entonces y ==z --> true::  x==y==z --> true
     *
     *      Consistente:
     *          Esto quiere decir que multiples invocaciones sobre el metodo equals, tiene que dar la misma
     *          respuesta y no debe alterar el estado interno del objeto.
     *
     *
     *      Para cualquier comparacion con null,  object.equals(null) --> debe dar falso
     */


    public boolean equals(Object obj){
        if(!(obj instanceof EqualsLearn)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        return Integer.valueOf(this.id).hashCode() + Objects.hashCode(this.anotherId);
    }
    public static void main(String[] args) {
        EqualsLearn equalsLearn = new EqualsLearn();
        System.out.println(equalsLearn.equals(null));
    }
}




