package ZZAclassesinternas.test;
    class Animal {
        public void walk() {
            System.out.println("Animal walking");
        }
    }

public class AnonymousClassesTest01 {
    //Classes anonimas vao existir por um curto periodo de tempo e nao podem ser reutilizadas em nenhum outro lugar.
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
