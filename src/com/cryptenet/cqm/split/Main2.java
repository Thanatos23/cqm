package com.cryptenet.cqm.split;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main2 {
    public static void main(String[] args) {
        new Order().setExpirationDate(nowPlusDays(4));
    }

    private static LocalDateTime now() {
        return LocalDateTime.now();
    }

    private static long nowPlusMonths(int months) {
        checkIsTimeValid(months);
        return toEpochMilli(now().plusMonths(months));
    }

    private static long nowPlusWeeks(int weeks) {
        checkIsTimeValid(weeks);
        return toEpochMilli(now().plusWeeks(weeks));
    }

    private static long nowPlusDays(int days) {
        checkIsTimeValid(days);
        return toEpochMilli(now().plusDays(days));
    }

    private static long toEpochMilli(LocalDateTime time) {
        return time.atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private static void checkIsTimeValid(int time) {
        if (time < 0) {
            throw new IllegalArgumentException("time cannot be less than 0");
        }
    }
}
