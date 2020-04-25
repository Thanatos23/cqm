package com.cryptenet.cqm.return_early;

public class Main {
    private static boolean systemIsUp = true;

    public static void main(String[] args) {
        System.out.println(getPersonalInfo2(
                new Person("John Collins", 1234),
                1234
        ));
    }

    // before
    private static String getPersonalInfo(Person person, int pin) {
        if (systemIsUp) {
            if (person != null && !person.getName().equals("")) {
                if (person.getPin() == pin) {
                    return person.getPersonalInfo();
                }
                return "Invalid pin";
            }
            return "Invalid user";
        }

        return "System id down";
    }

    // after
    private static String getPersonalInfo2(Person person, int pin) {
        if (!systemIsUp) {
            return "System id down";
        }

        if (person == null || person.getName().equals("")) {
            return "Invalid user";
        }

        if (person.getPin() != pin) {
            return "Invalid pin";
        }

        return person.getPersonalInfo();
    }
}
