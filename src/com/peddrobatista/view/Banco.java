package com.peddrobatista.view;

import com.peddrobatista.helper.Utils;
import com.peddrobatista.model.Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    static String nome = "Pedro Trade Center";
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contas;


    public static void main(String[] args) {
        Banco.contas = new ArrayList<Conta>();
        Banco.menu();
    }

    public static void menu() {
        int opcao = 0;
        System.out.println("===================================");
        System.out.println("=============== ATM ===============");
        System.out.println("======= " + Banco.nome + " ========");
        System.out.println("===================================");
        System.out.println("Selecione uma opção no menu: ");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Efetuar saque");
        System.out.println("3 - Efetuar depósito");
        System.out.println("4 - Efetuar transferência");
        System.out.println("5 - Listar contas");
        System.out.println("6 - Sair do Sistema");

        try {
            opcao = Integer.parseInt(Banco.teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por Favor informe uma opção válida!");
            Utils.pausar(1);
            Banco.menu();
        }

        switch (opcao) {
            case 1:
                Banco.criarConta();
                break;
            case 2:
                Banco.efetuarSaque();
                break;
            default:
                break;
        }
    }

}
