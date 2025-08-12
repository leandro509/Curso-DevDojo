package Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Wrappers sao objetos que vao encapsular tipos primitivos

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //Agora nos temos classes para representar os tipos primitivos da direita.
        //A regra de polimorfismo é aplicada.
        //Agora sao objetos.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;
        //Autoboxing e quando voce tem um tipo primitivo e voce faz o java transformar esse tipo primitivo em um tipo wrapper.

        int i = intW;
        //Unboxing e o contrario, quando se transforma um tipo wrapper em tipo primitivo.
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro  = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
