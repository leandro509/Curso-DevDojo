package Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome  = "William"; //String constant pool
        String nome2 = "William";
        //Se voce criar uma outra String e o java verificar que ela ja existe no pool de String,
        //ele so vai te devolver a referencia daquele valor.
        nome = nome.concat(" Suane");// nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("William"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string.
        //Quando voce cria um objeto a sua variavel de referencia esta
        //referenciando o objeto, que encapsula "William" que esta dentro do pool de String.
        //nome3 -> objeto "William" -> "William" dentro do pool de strings.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        //String sao imutaveis.


    }
}
