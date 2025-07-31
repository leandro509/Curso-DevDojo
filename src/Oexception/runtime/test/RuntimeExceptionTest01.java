package Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        /* Checked e Unchecked
        Execoes checadas sao filhas da classe exception diretamente,
        se nao tratadas voce nem consegue compilar o seu codigo.
        Execoes nao checadas sao classes filhas da RuntimeException para baixo.
        Se voce ta tendo uma excecao que e uma RuntimeException e essas excecoes sao
        lancadas pelo proprio Java de algum lugar, quase certeza que e o seu codigo que
        precisa ser melhorado.
        Nas RuntimeException como elas sao unchecked voce nao precisa fazer um tratamento,
        quando voce tem uma checked exception e obrigatorio voce fazer um tratamento, caso
        contrario o codigo nao compila.
         */
        int nums[] = {1,2};
        System.out.println(nums[2]);
    }
}
