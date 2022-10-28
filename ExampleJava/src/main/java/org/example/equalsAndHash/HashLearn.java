package org.example.equalsAndHash;

import java.util.Objects;

public class HashLearn {

    int id;
    String edad;

    /**
     * Dentro del mismo programa el resultado del hashCode no debe cambiar, es decir no se pueden incluir variables em
     * el numero hash que cambien durante la vida del objeto
     *
     * Si equals retorna true con dos objetos, el resultado del hashCode es el mismo tambien para los dos objetos
     *
     * Si equals retorna false, no necesariamente el resultado de hashCode es distinto
     *
     *
     * Un metodo hashCode no es legal cual usa internamente mas variables que el metodo equals, el que no sea legal
     * no significa que no compile
     */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof HashLearn)) return false;
        HashLearn another = (HashLearn) o;
        return id==another.id && edad.equals(another.edad);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(this.id) + 7 * edad.hashCode();
    }
}
