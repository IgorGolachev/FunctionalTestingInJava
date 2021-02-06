package util;

import java.time.LocalDate;

public final class DateTimeUtils {

    public static LocalDate parseDate(String date) {
        return LocalDate.parse(date);
    }
}

