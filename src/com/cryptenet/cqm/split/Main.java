package com.cryptenet.cqm.split;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        long millisSinceEpoch = nowPlusTime(0, 0, 4);

        // before
        new Order().setExpirationDate(millisSinceEpoch);

        // after
        new Order().setExpirationDate(nowPlusDays(4));
    }

    private static long nowPlusTime(int months, int weeks, int days) {
        return LocalDateTime.now().plusMonths(months)
                .plusWeeks(weeks)
                .plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private static long nowPlusMonths(int months) {
        if (months < 0) {
            throw new IllegalArgumentException("months cannot be less than 0");
        }

        return LocalDateTime.now().plusMonths(months)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private static long nowPlusWeeks(int weeks) {
        if (weeks < 0) {
            throw new IllegalArgumentException("weeks cannot be less than 0");
        }

        return LocalDateTime.now().plusWeeks(weeks)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    private static long nowPlusDays(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("days cannot be less than 0");
        }

        return LocalDateTime.now().plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}
