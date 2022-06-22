package task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DateToDayOfWeekConvertor date = new DateToDayOfWeekConvertor(LocalDate.of(2022, 6, 22));
        date.showDayOfWeek();
    }
}
