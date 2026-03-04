package Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InstantTest01 {
    public static void main(String[] args) {
        //Instant trabalha com nanossegundos.
        Instant now = Instant.now();
        //Esse objeto e imutavel.
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));
        DateTimeFormatter formatoPadrao = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HHmm");
        LocalDateTime dataLocal = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        String dataFormatada  = dataLocal.format(formatoPadrao);
        System.out.println(dataFormatada);
    }
}
