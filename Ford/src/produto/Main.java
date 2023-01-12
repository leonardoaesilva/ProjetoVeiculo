package produto;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(TipoCarro.HIBRIDO, "Ford", "modeloX", "Verde");
		
		Carro carro2 = new Carro(TipoCarro.ELETRICO, "Ford", "modeloY", "Azul");
		
		Aereo aviao = new Aereo("Airbus", "A350 XWB", "Azul");

		System.out.println("Carro 1:");
		System.out.println(carro1.getModelo());
		carro1.aumentarVelocidade();
		carro1.aumentarVelocidade();

		System.out.println("Carro 2:");
		System.out.println(carro2.getModelo());
		carro2.aumentarVelocidade();
		carro2.diminuirVelocidade();
		System.out.println("Carro 1 é igual Carro2:");
		System.out.println(carro1.equals(carro2));
		System.out.println("Aviao:");
		System.out.println(aviao.getMarca());
		System.out.println(aviao.getModelo());
		aviao.aumentarVelocidade();
		aviao.aumentarVelocidade();
		aviao.diminuirVelocidade();


		


	}

}
