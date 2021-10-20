package exercicio;

public class Ave extends Animal{

	public Ave(String especie) {
		super(especie);
	}

	@Override
	public void comunicar() {
		System.out.println("A ave comunica-se cantando!"); 		
	}

	@Override
	public void movimentar() {
		System.out.println("O ave movimenta-se voando!");
	}
	
}
