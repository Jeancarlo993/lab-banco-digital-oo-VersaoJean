package model;


public class Cliente {

	private String nome;
        private Conta contaDoCliente;
        
        public Cliente(String nome, Conta conta){
            this.nome = nome;
            contaDoCliente = conta;
        }
        
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
