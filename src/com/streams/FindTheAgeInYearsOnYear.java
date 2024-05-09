package com.streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class FindTheAgeInYearsOnYear {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1985,05,23);
        LocalDate  today =  LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthday,today));
    }
}
