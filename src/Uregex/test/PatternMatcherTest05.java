package Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z]+))+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println((texto.split(",")[1].trim()));
        //Ve se a string entra na regra da expressao regular.
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
