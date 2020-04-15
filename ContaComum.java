
package contaBanco;

public class ContaComum extends Conta {
	
	public ContaComum(String nome,int numero, float valorInicial) {
		super(nome,numero,valorInicial);
	}

	@Override
	public boolean sacar(float valor) {
		if(valor < 0)
		{	
			System.out.println("Valor de saque inválido \n");
			return false;
		}
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
}
