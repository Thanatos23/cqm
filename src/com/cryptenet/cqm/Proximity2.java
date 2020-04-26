package com.cryptenet.cqm;

public class Proximity2 {
    void methodA() {
        methodB();
    }

    void methodB() {
        methodC();
        someOtherMethod();
    }

    void methodC() {
        doTheOtherThing();
    }

    void someOtherMethod() {
        // doing something
    }

    void doTheOtherThing() {
        // doing the other something
    }
}
