package exercicio;

public class Mamifero extends Animal{

	public Mamifero(String especie) {
		super(especie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comunicar() {
		System.out.println("O mam�fero comunica-se fazendo barulho!"); 		
	}

	@Override
	public void movimentar() {
		System.out.println("O mam�fero movimenta-se andando!");
	}

}
