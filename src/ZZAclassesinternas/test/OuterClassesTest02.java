package ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print(final String param) {
        final String lastName = "Izuku";
        //classes locais sao classes que podem ser criadas dentro de metodos
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name +  " " + lastName);
            }
        }
        LocalClass local = new LocalClass();//Esse eh o unico jeito de inicializar classes locais, inicializar dentro do metodo.
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("oi");
    }
}
