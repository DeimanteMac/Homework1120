/*
Create a function that calculates the number of days between two dates.

The function should accept the following parameters:

year_from

month_from

day_from

year_to

month_to

day_to
*/
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(daysBetween(2025, 12, 24, 2026, 11, 15));
    }

    static long daysBetween(int year_from, int month_from, int day_from,
                            int year_to, int month_to, int day_to) {
        LocalDate nuo = LocalDate.of(year_from, month_from, day_from);
        LocalDate iki = LocalDate.of(year_to, month_to, day_to);

        return ChronoUnit.DAYS.between(nuo, iki);
    }
}
