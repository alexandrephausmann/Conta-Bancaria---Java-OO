package contaBanco;
public abstract class Conta {

	private String nome;
	private int numero;
	protected float saldo;
	
	public Conta(String nome, int numero, float valorInicial) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = valorInicial;
	}

	public boolean depositar(float valor) {
		if(valor < 0)
		{	
			System.out.println("Valor de saque inválido \n");
			return false;
		}
		this.saldo += valor;
		
		return true;
	}
	
	public abstract boolean sacar(float valor);
	
	public void adicionarSaldo(float valor) {
		this.saldo += valor;
	}

	public void removerSaldo(float valor) {
		this.saldo -= valor;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public float getSaldo(){
		return this.saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean transferir(Conta destino,float valor) {
		if(valor < 0)
		{	
			System.out.println("Valor de transferência inválido \n");
			return false;
		}
		if(this.saldo - valor >= 0) {
			this.saldo -= valor;
			destino.adicionarSaldo(valor);
			System.out.println("Sucesso ao realizar a transferencia!");
			return true;
		}else {
			System.out.println("Você nao possui saldo suficiente.\n Seu saldo atual é: " + this.getSaldo());
			
		}
		return false;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
}