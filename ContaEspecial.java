package contaBanco;

public class ContaEspecial extends Conta{
	
	private float limiteCredito;
	
	public ContaEspecial(String nome,int numero, float valorInicial, float limite) {
		super(nome,numero,valorInicial);
		this.limiteCredito = limite;
	}

	@Override
	public boolean sacar(float valor) {
		if(valor < 0)
		{	
			System.out.println("Valor de saque inválido \n");
			return false;
		}
		if(this.saldo  + limiteCredito >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}
