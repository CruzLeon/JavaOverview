package org.example.creationalPatterns.innmutable;

import java.util.ArrayList;
import java.util.List;

public final class InnmutableClass {
    private final int myField1;
    private final String myField2;
    private final List<?> myField3;

    public InnmutableClass(int myField1, String myField2, List<?> myField3) {
        this.myField1 = myField1;
        this.myField2 = myField2;
        this.myField3 = new ArrayList<>(myField3);
    }

    public int getMyField1() {
        return myField1;
    }

    public String getMyField2() {
        return myField2;
    }

    public Object getMyField3Value(int index) {
        return myField3.get(index);
    }
}
