package com.peddrobatista.model;

import com.peddrobatista.helper.Utils;

public class Conta {
    private static int codigo = 101;

    private int numero;
    private Cliente cliente;
    private Double saldo = 0.0;
    private Double limite = 0.0;
    private Double saldoTotal;

    public Conta(Cliente cliente) {
        this.numero = Conta.codigo;
        this.cliente = cliente;
        Conta.codigo += 1;
        this.atualizaSaldoTotal();
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Conta.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldoTotal() {
        return saldoTotal;
    }

    private void atualizaSaldoTotal() {
        this.saldoTotal = this.getSaldo() + this.getLimite();
    }

    public String toString() {
        return "Número da Conta: " + this.getNumero() +
                "\nCliente: " + this.cliente.getNome() +
                "\nSaldo Total: " + Utils.doubleParaString(this.getSaldoTotal());
    }

    public void depositar(Double valor) {
        if(valor > 0) {
            this.saldo = this.getSaldo() + valor;
            this.atualizaSaldoTotal();
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Erro ao efetuar depósito. Tente novamente!");
        }
    }

    public void sacar(Double valor) {

    }
}
