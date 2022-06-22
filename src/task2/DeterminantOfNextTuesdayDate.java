package task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;

public class DeterminantOfNextTuesdayDate {
    private LocalDate date;

    public DeterminantOfNextTuesdayDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate findDateOfNextTuesday() {
        LocalDate dateOfTuesday = date;
        DayOfWeek day = dateOfTuesday.getDayOfWeek();
        while (true) {
            dateOfTuesday = dateOfTuesday.plusDays(1);
            if (dateOfTuesday.getDayOfWeek().toString().equalsIgnoreCase("Tuesday") && dateOfTuesday.getDayOfYear() - date.getDayOfYear() > 1) {
                break;
            }
        }
        return dateOfTuesday;
    }
}
