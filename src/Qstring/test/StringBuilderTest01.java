package Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        //StringBuilder se adiciona coisas, apartir do metodo append.
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        //Os metodos acima funcionam normalmente com StringBuffer.
        System.out.println(sb);
    }
}
