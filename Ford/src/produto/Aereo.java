package produto;

public class Aereo extends Veiculo{
	private int potencia = 3;
	private int velocidadeAerea = 50;
	private double efeitoGravidade = 0.8; 
	
	public Aereo() {
		super();
	}
	
	public Aereo(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
	}
	
	@Override
	public void aumentarVelocidade() {
		setVelocidade(getVelocidade()+(velocidadeAerea*potencia*efeitoGravidade));
		printVelocidade();
	}

	@Override
	public void diminuirVelocidade() {
		if(getVelocidade()>0) {
			setVelocidade((getVelocidade()-(velocidadeAerea*efeitoGravidade)));
			printVelocidade();
		}else{
			System.err.println("Velocidade não pode ser reduzida");
		}
		
	}

}
