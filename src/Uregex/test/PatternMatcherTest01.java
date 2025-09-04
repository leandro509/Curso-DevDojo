package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //Regex sao expresso regulares
        String regex = "aba";
        //String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        //Matcher vai ficar procurando no texto.
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start()+ " ");
            //Ele encontrou as posicoes.
            //Quando o regex encontra algo ele comeca a contar a partir do proximo.
        }
    }
}
