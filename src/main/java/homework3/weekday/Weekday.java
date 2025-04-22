package homework3.weekday;

public enum Weekday {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;


    // Check the working day in the series.
    public boolean isWeekDay() {
        return this != Weekday.Saturday && this != Weekday.Sunday;
    }

    // Check the Holiday day in the series.
    public boolean isHoliday () {
        return this == Saturday || this == Sunday;
    }
}


