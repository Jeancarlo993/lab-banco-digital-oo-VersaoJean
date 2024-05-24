package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import model.Cliente;
import java.util.ArrayList;
/**
 *
 * @author jean_
 */
public class Agencia{
    private final int CODIGO;
    private ArrayList<Cliente> clientesDaAgencia = new ArrayList();
    
    public Agencia(int codigoDaAgencia){
        CODIGO=codigoDaAgencia;
    }
    
        public void addCliente(Cliente e){
            if(clientesDaAgencia != null){
                for(Cliente cliente : clientesDaAgencia){
                    if(cliente.equals(e)){
                        System.out.println("Cliente ja existe!!!");
                        return;
                    }
                }
            }
            clientesDaAgencia.add(e);
        }
        
        public void removeAgencia(Cliente a){
            try{
                clientesDaAgencia.remove(a);
            }
            catch(Exception e){
                System.out.println("Cliente nao encontrado");
            }
        }
}
