package produto;

public abstract class Veiculo {
	private String marca;
	private double velocidade;
	private String modelo;
	private String cor;
	
	protected Veiculo() {
		super();
		
	}
	
	protected Veiculo(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.velocidade = 0;
		this.modelo = modelo;
		this.cor = cor;
	}

	public abstract void aumentarVelocidade();
	
	public abstract void diminuirVelocidade();
	
	public void printVelocidade() {
		System.out.println("Velocidade atual "+getVelocidade());
	}

	public String getMarca() {
		return marca;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
