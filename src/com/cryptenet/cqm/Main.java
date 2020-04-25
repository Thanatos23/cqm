package com.cryptenet.cqm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Calendar calendar = new GregorianCalendar(new TimeZone() {
//            @Override
//            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
//                return 0;
//            }
//
//            @Override
//            public void setRawOffset(int offsetMillis) {
//
//            }
//
//            @Override
//            public int getRawOffset() {
//                return 0;
//            }
//
//            @Override
//            public boolean useDaylightTime() {
//                return false;
//            }
//
//            @Override
//            public boolean inDaylightTime(Date date) {
//                return false;
//            }
//        }, new Locale("en", "", ""));

        Calendar calendar = GregorianCalendar.getInstance();

        Pizza pizza = new Pizza.Builder(1)
                .cheese(true)
                .ham(false)
                .mushroom(true)
                .build();
    }
}
