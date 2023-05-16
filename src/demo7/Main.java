package demo7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
//        String ns = "13/5/2004";
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2);
        System.out.println(ld2);
        LocalDate ld3 = ld1.plusWeeks(3);
        System.out.println(ld3);
        LocalDate ld4 = ld1.minusDays(3);

        String bth = "2004-05-13";
        LocalDate ld5 = LocalDate.parse(bth);
        System.out.println(ld5.getDayOfWeek());

        LocalDate ld6 = LocalDate.of(2004,8,15);

        LocalDateTime lt1 =  LocalDateTime.now();
        LocalDateTime lt2 = lt1.plusMinutes(5);
        LocalDateTime lt3 = lt1.minusMinutes(5);
    }
}
