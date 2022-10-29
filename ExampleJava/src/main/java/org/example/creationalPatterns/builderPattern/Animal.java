package org.example.creationalPatterns.builderPattern;

public class Animal {

    private final int value1, value2;
    private final String value3, value4;

    private Animal(int value1, int value2, String value3, String value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }


    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public String getValue3() {
        return value3;
    }

    public String getValue4() {
        return value4;
    }

    public static final class AnimalBuilder {

        private int value1, value2;
        private String value3, value4;

        public AnimalBuilder setValue1(int value1) {
            this.value1 = value1;
            return this;
        }

        public AnimalBuilder setValue2(int value2) {
            this.value2 = value2;
            return this;

        }

        public AnimalBuilder setValue3(String value3) {
            this.value3 = value3;
            return this;

        }

        public AnimalBuilder setValue4(String value4) {
            this.value4 = value4;
            return this;

        }

        public Animal build() {
            return new Animal(value1, value2, value3, value4);
        }
    }

    @Override
    public String toString() {
        return "{\"Animal\":{"
                + "\"value1\":\"" + value1 + "\""
                + ", \"value2\":\"" + value2 + "\""
                + ", \"value3\":\"" + value3 + "\""
                + ", \"value4\":\"" + value4 + "\""
                + "}}";
    }
}
