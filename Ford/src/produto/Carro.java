package produto;

import java.util.Random;

public class Carro extends Terrestre{
	private TipoCarro tipo;
	private String chassi;
	private String placa;

	public Carro() {
		super();
		Random gerador = new Random();
		this.chassi = tipo.name()+gerador;
	}
	
	public Carro(TipoCarro tipo, String marca, String modelo, String cor) {
		super(marca, modelo, cor);
		Random gerador = new Random();
		this.tipo = tipo;
		this.chassi = tipo.name()+gerador;
	}
	
	
	
	public boolean equals(Object obj) {
        if(this == obj) {
        	return true;
        }
        return (obj instanceof Carro aCarro) 
        		&& this.chassi.equals(aCarro.getChassi())
        		&& this.placa.equals(aCarro.getPlaca())
        		&& this.tipo.equals(aCarro.getTipo());
    }
	
	public TipoCarro getTipo() {
		return tipo;
	}

	public String getChassi() {
		return chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
		
}
