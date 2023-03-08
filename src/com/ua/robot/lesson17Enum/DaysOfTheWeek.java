package com.ua.robot.lesson17Enum;

public enum DaysOfTheWeek {
    MONDAY (1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private final int indexNumber;

     DaysOfTheWeek(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }



}
