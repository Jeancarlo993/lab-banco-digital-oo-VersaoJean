package controller;

import java.util.Scanner;
import model.Agencia;
import model.Banco;
import model.Cliente;
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
    // A classe construtora carregara os dados do projeto
    public Banco bancoA = new Banco("Banco A");
    public Banco bancoB = new Banco("Banco B");
    public Scanner scan = new Scanner(System.in);
    public CaixaEletronico() {
        
        // AGENCIA
        Agencia agenciaAA = new Agencia(00001);
        // CONTAS E CLIENTES DA AGENCIA
        Cliente clienteAAA = new Cliente("Andre C", new ContaCorrente());
        clienteAAA.getContaDoCliente().depositar(3200);
        Cliente clienteAAB = new Cliente("Alana D", new ContaCorrente());
        clienteAAB.getContaDoCliente().depositar(1400);
        Cliente clienteAAC = new Cliente("Ariane A", new ContaCorrente());
        clienteAAC.getContaDoCliente().depositar(15000);
        agenciaAA.addCliente(clienteAAA);
        agenciaAA.addCliente(clienteAAB);
        agenciaAA.addCliente(clienteAAC);
        bancoA.addAgencia(agenciaAA);
        // FIM DA CRIACAO DA AGENCIA
        // AGENCIA
        Agencia agenciaAB = new Agencia(00002);
        // CONTAS E CLIENTES DA AGENCIA
        Cliente clienteABA = new Cliente("Braulio N", new ContaCorrente());
        clienteABA.getContaDoCliente().depositar(13200);
        Cliente clienteABB = new Cliente("Bruna C", new ContaCorrente());
        clienteABB.getContaDoCliente().depositar(200);
        Cliente clienteABC = new Cliente("Brisa C", new ContaCorrente());
        clienteABC.getContaDoCliente().depositar(0);
        agenciaAA.addCliente(clienteABA);
        agenciaAA.addCliente(clienteABB);
        agenciaAA.addCliente(clienteABC);
        bancoA.addAgencia(agenciaAB);
        // FIM DA CRIACAO DA AGENCIA
    }

    public void operarBanco() {
        System.out.println(bancoA.getNome());
        System.out.println("Agencia " + bancoA.getAgencia(0).getCODIGO());
        System.out.println("Conta "+ bancoA.getAgencia(0).getClientesDaAgencia(0).getContaDoCliente().getNumero());
        System.out.println("Bem vindo "+ bancoA.getAgencia(0).getClientesDaAgencia(0).getNome());
        System.out.println("Seu saldo R$"+ bancoA.getAgencia(0).getClientesDaAgencia(0).getContaDoCliente().getSaldo());
        
         
    }
}
