package com.zemoso.builder;

public class Pizza {
    private final int size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean sausage;

    public static class Builder {
        //required
        private final int size;

        //optional
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean sausage = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            pepperoni = value;
            return this;
        }

        public Builder sausage(boolean value) {
            sausage = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        sausage = builder.sausage;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size = " + size +
                ", cheese = " + cheese +
                ", pepperoni = " + pepperoni +
                ", sausage = " + sausage +
                '}';
    }
}