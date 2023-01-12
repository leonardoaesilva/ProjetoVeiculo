package produto;

public class Terrestre extends Veiculo{
	private int potencia = 1;
	private int velocidadeTerreste = 10;
	
	public Terrestre() {
		super();
	}
	
	public Terrestre(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
	}
	
	
	@Override
	public void aumentarVelocidade() {
		setVelocidade(getVelocidade()+velocidadeTerreste*potencia);
		printVelocidade();
	}
	
	public final void buzina() {
		System.out.println("BI BI BIIIIIIIIII");
	}

	@Override
	public void diminuirVelocidade() {
		if(getVelocidade()>0) {
			setVelocidade(getVelocidade()-velocidadeTerreste);
			printVelocidade();
		}else{
			System.err.println("Velocidade não pode ser reduzida");
		}		
		
	}

}
