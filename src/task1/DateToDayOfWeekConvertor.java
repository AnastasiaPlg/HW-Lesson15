package task1;

import java.time.LocalDate;

public class DateToDayOfWeekConvertor {
    private LocalDate date;

    public DateToDayOfWeekConvertor(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void showDayOfWeek() {
        System.out.println(date.getDayOfWeek().toString());
    }
}
