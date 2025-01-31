/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kenum.dominio;

/**
 *
 * @author leandro
 */
public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;

    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", tipoCliente=" + tipoCliente.getNomeRelatorio() + ", tipoClienteInt =" + tipoCliente.VALOR + ", tipoPagamento=" + tipoPagamento.toString() + '}';
    }

}
