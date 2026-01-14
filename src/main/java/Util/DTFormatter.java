package Util;

import java.time.format.DateTimeFormatter;

public class DTFormatter {
    public static final DateTimeFormatter formatterTXT = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
    public static final DateTimeFormatter formatterDB= DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");

    public static final DateTimeFormatter formatterTXT() {
        return formatterTXT;
    }

    public static final DateTimeFormatter formatterDB() {
        return formatterDB;
    }
}
