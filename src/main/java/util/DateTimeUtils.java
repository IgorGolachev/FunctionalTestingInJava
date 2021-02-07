package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateTimeUtils {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static LocalDate parseDate(String date) {
        return LocalDate.parse(date, dtf);
    }
}

