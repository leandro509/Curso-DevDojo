package Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo arquivos");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexao aberta";
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
        //o bloco finally sempre vai ser executado.
    }

    private static void abreConexao2() {
        try{
            System.out.println("Abrindo arquivos");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        //somente o try sozinho nao pode ser utilizado, precisa ter o catch ou o finally apos.

    }

}
