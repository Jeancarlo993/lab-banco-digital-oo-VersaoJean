package controller;

import model.Agencia;
import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jean_
 */
public class CaixaEletronico {
    
    public CaixaEletronico(){
        Banco bancoA= new Banco("Banco A");
            //AGENCIA
            Agencia agenciaAA = new Agencia(00001);
                //CONTAS E CLIENTES DA AGENCIA 
                Conta contaDoUsuarioAAA = new ContaCorrente();
                    Cliente clienteAAA = new Cliente("Andre C", contaDoUsuarioAAA);
                Conta contaDoUsuarioAAB = new ContaCorrente();
                    Cliente clienteAAB = new Cliente("Alana A",contaDoUsuarioAAB);
                Conta contaDoUsuarioAAC = new ContaCorrente();
                    Cliente clienteAAC = new Cliente("Ariane A",contaDoUsuarioAAC);
                agenciaAA.addCliente(clienteAAA);
                agenciaAA.addCliente(clienteAAB);
                agenciaAA.addCliente(clienteAAC);
                bancoA.addAgencia(agenciaAA);
                //FIM DA CRIACAO DA AGENCIA
            //AGENCIA
            Agencia agenciaAB = new Agencia(00002);
                //CONTAS E CLIENTES DA AGENCIA 
                Conta contaDoUsuarioABA = new ContaCorrente();
                    Cliente clienteABA = new Cliente("Braulio C", contaDoUsuarioABA);
                Conta contaDoUsuarioABB = new ContaCorrente();
                    Cliente clienteABB = new Cliente("Bruna A",contaDoUsuarioABB);
                Conta contaDoUsuarioABC = new ContaCorrente();
                    Cliente clienteABC = new Cliente("Brisa A",contaDoUsuarioABC);
                agenciaAA.addCliente(clienteABA);
                agenciaAA.addCliente(clienteABB);
                agenciaAA.addCliente(clienteABC);
                bancoA.addAgencia(agenciaAB);
                //FIM DA CRIACAO DA AGENCIA   
    }
            
    public void abrirBanco(){
        System.out.println("Qual o banco você deseja entrar?");
        // exibir uma lista de bancos 
        // receber nome do banco


        System.out.println("Qual a sua agência?");
        // exibir uma lista de agencias
        // receber numero da agencia

               
        System.out.println("Digite sua conta: ");
        // carregar conta de um arquivo
        
    }
}
