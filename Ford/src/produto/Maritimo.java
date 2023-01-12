package produto;

public class Maritimo extends Veiculo{
	private int potencia = 10;
	private int velocidadeMaritima = 4;
	private double efeitoMare = 0.95; 
	
	public Maritimo() {
		super();
	}
	
	public Maritimo(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
	}
	
	@Override
	public void aumentarVelocidade() {
		setVelocidade(getVelocidade()+(velocidadeMaritima*potencia*efeitoMare));
		printVelocidade();
	}

	@Override
	public void diminuirVelocidade() {
		if(getVelocidade()>0) {
			setVelocidade((getVelocidade()-(velocidadeMaritima*efeitoMare)));
			printVelocidade();
		}else{
			System.err.println("Velocidade não pode ser reduzida");
		}
		
	}

}
