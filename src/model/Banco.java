package model;

import java.util.ArrayList;

public class Banco {

	final String NOME;
        private ArrayList<Agencia> agenciasDoBanco = new ArrayList();
        
        public Banco(String nomeDoBanco){
            NOME = nomeDoBanco;
        }
        
	public String getNome() {
		return NOME;
	}
        
        public void addAgencia(Agencia e){
            if(agenciasDoBanco != null){
                for(Agencia agencia : agenciasDoBanco){
                    if(agencia.equals(e)){
                        System.out.println("Agencia ja existe!!!");
                        return;
                    }
                }
            }
            agenciasDoBanco.add(e);
        }
        
        public void removeAgencia(Agencia a){
            try{
                agenciasDoBanco.remove(a);
            }
            catch(Exception e){
                System.out.println("Agencia nao encontrada");
            }
        
        }
}
