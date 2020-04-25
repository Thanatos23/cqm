package com.cryptenet.cqm.fail_early;

public class Main {
    public static void main(String[] args) {
        int total = getTotalCompensation(0);

        System.out.println(total);
    }

    private static int getTotalCompensation(int bonusAmount) {
        // add fail-first checks
        if (bonusAmount <= 0) {
            throw new IllegalArgumentException("bonus cannot be less than or equal to 0");
        }

        int intermediateResult = getBaseSalary() * bonusAmount;

        int secondIntermediateResult = convertToLocalCurrency(intermediateResult);

        return getSomeOtherMetrics() / secondIntermediateResult;
    }

    private static int getBaseSalary() {
        return 10_000;
    }

    private static int convertToLocalCurrency(int foreignCurrency) {
        return foreignCurrency * 85;
    }

    private static int getSomeOtherMetrics() {
        return 5;
    }
}
