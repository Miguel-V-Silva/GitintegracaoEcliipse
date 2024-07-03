package att9;

public class TesteConta {

	public static void main(String[] args) {
		
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "12345";
		conta.agencia = "3087";
		conta.limiteEspecial = 2000;
		conta.valorEspecialUsado = 0;
		conta.saldo = -20;
		conta.especial = true;
		conta.situacaoConta[0] = "ativa";
		conta.situacaoConta[1] = "inativa";
		
		System.out.println("Saldo da conta: "  + conta.numero + " e " +conta.saldo);
		System.out.println("Limite da Conta: " + conta.numero + "e " +conta.limiteEspecial);
		System.out.println("Conta EspeciaL: " + conta.especial);
		System.out.println("Situacao Conta: " + conta.situacaoConta[0]);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso ");
			conta.consultarSaldo();
		}else {
			System.out.println("N o foi possivel efetuar o saque. Saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(2000);
		System.out.println("Tentativa de saque de 2000 reais");
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso ");
			conta.consultarSaldo();
		}else {
			System.out.println("N o foi possivel efetuar o saque. Saldo insuficiente");
		}
		
		System.out.println(" Deposito de 2000 reais");
		conta.consultarSaldo();
		conta.depositar(2000);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println(" Esta utilizando o especial");
		}
		else {
			System.out.println(" N o esta utilizando o especial");
		}

	}

}
