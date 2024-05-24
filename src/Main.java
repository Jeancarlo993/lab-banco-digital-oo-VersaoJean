
public class Main {

	public static void main(String[] args) {
            Banco bancoDoJean= new Banco("Banco Do Jean - BJ");
            Agencia paisDasMaravilhas = new Agencia(00001);
            Conta contaDeJean = new ContaCorrente();
            Cliente jean = new Cliente("Jean C", contaDeJean);
            paisDasMaravilhas.addCliente(jean);
            bancoDoJean.addAgencia(paisDasMaravilhas);
            
	}

}
