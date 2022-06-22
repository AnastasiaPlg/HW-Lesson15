package task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DeterminantOfNextTuesdayDate determinant = new DeterminantOfNextTuesdayDate(LocalDate.of(2022, 6, 20));
        System.out.println(determinant.findDateOfNextTuesday());
    }
}
