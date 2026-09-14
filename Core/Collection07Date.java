package Core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class LearnDate {
    // public void AboutOldDate() {
    // Date d = new Date();
    // System.out.println(d); // Mon Sep 14 22:32:11 IST 2026
    // System.out.println(d.getDate());
    // System.out.println(d.getDay());
    // System.out.println(d.getMonth());
    // System.out.println(d.getYear()); // default year is 1900 so it will return
    // the year - 126 according to 2026
    // d.setYear(2026); // it set year to 2026
    // d.setDate(15);
    // System.out.println(d.getYear()); // it will return 2026
    // System.out.println(d.getDate());
    // }

    public void AboutNewDate() {
        System.out.println("About LocalDate");
        LocalDate ld = LocalDate.now();
        System.out.println(ld); // 2026-09-14
        System.out.println(ld.getYear()); // 2026
        System.out.println(ld.getMonth()); // SEPTEMBER
        System.out.println(ld.getMonthValue()); // SEPTEMBER
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth()); // 14

        System.out.println("");
        System.out.println("About LocalTime");
        // local time for accessing the time
        LocalTime time = LocalTime.now();
        System.out.println(time); // 22:32:11.123456789
        System.out.println(time.getHour()); // 22
        System.out.println(time.getMinute()); // 32
        System.out.println(time.getSecond()); // 11
        System.out.println(time.getNano()); // 123456789

        System.out.println("");
        System.out.println("About newDate");
        // ld.of(2022, 23, 1); // error becuase month is invalid
        LocalDate newDate = ld.of(2022, 1, 19);
        System.out.println(newDate); // 2022-01-19
        System.out.println(newDate.getYear()); // 2022
        System.out.println(newDate.getMonth()); // JANUARY
        System.out.println(newDate.getMonthValue()); // JANUARY
        System.out.println(newDate.getDayOfMonth()); // 19
        System.out.println(newDate.getDayOfWeek()); // WEDNESDAY

        System.out.println("");
        System.out.println("About Localtime and date both");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }

}

public class Collection07Date {
    public static void main(String[] args) {
        LearnDate ld = new LearnDate();
        // ld.AboutOldDate();
        ld.AboutNewDate();
    }
}
