
public class Cliente {

	private String nome;
        private Conta contaDoCliente;
        
        Cliente(String nome, Conta conta){
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
