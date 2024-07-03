package att9;

public class ContaCorrente {
	
	String numero;
	//recebaaaaa
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	String[] situacaoConta = new String[2];
	
	boolean realizarSaque(double qtdSaque) {
		
		if(saldo >= qtdSaque ){ // tem saldo em conta
			saldo -=qtdSaque;
			return true;
		}else { // n o tem saldo em conta suficiente
			if(especial) {// verifica se   especial
				double limite = limiteEspecial + saldo;
				if(limite >= qtdSaque) {// verifica se o limite especial tem saldo 
					saldo -=qtdSaque;
					return true;
				}else {
					return false;
				}
				
			}else {// n o   especial e n o tem saldo suficiente
				return false;
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo =+ valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta   " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return (saldo < 0);
	}
		
}
