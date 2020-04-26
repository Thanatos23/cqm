package com.cryptenet.cqm;

public class Proximity {
    void methodA() {
        methodB();
    }

    void someOtherMethod() {
        // doing something
    }

    void methodC() {
        doTheOtherThing();
    }

    void methodB() {
        methodC();
    }

    void doTheOtherThing() {
        // doing the other something
    }
}
