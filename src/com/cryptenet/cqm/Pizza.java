package com.cryptenet.cqm;

public class Pizza {
    private int size;
    private boolean cheese;
    private boolean ham;
    private boolean mushroom;

//    public Pizza(int size) {
//        this(size, false);
//    }

//    public Pizza(int size, boolean ham) {
//        this(size, true, ham);
//    }
//
//    public Pizza(int size, boolean cheese, boolean ham) {
//        this(size, cheese, ham, false);
//    }
//
//    public Pizza(int size, boolean cheese, boolean ham, boolean mushroom) {
//        this.size = size;
//        this.cheese = cheese;
//        this.ham = ham;
//        this.mushroom = mushroom;
//    }

    public Pizza(Builder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.cheese = pizzaBuilder.cheese;
        this.ham = pizzaBuilder.ham;
        this.mushroom = pizzaBuilder.mushroom;
    }

    static class Builder {
        private int size;
        private boolean cheese;
        private boolean ham;
        private boolean mushroom;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder ham(boolean ham) {
            this.ham = ham;
            return this;
        }

        public Builder mushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        Pizza build() {
            return new Pizza(this);
        }
    }
}
