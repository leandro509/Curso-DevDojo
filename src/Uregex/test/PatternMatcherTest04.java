package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Todos os espacos em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-z, digitos, _
        // \W = Tudo o que nao for incluso no \w
        // []
        // Quantificadores vao te dar poder em pegar determinada expressao baseada na quantidade que o metacaracter representa
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        //{n,m} de n ate m
        // ()
        // | o(v|c)o ovo | oco
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        //Matcher vai ficar procurando no texto.
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n" );
            //Ele encontrou as posicoes.
            //Quando o regex encontra algo ele comeca a contar a partir do proximo.
        }
    }
}
