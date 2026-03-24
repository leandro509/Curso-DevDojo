package ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);//O this nesse caso faz referencia ao objeto interno
            System.out.println(OuterClassesTest01.this);//Nesse caso faz referencia ao objeto externo
        }
    }

    public static void main(String[] args) {
        //Para criar um objeto da classe interna, voce precisa de um objeto da classe externa
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner2 = new OuterClassesTest01().new Inner();//Outra forma de criar
        Inner inner = outerClass.new Inner(); //Criando uma variavel da classe de dentro, utilizando a classe de fora
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
