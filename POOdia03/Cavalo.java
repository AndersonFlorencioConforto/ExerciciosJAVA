package AulaPOO;

public class Cavalo extends Animal {

	public Cavalo() {
		super("Pé de pano", 7);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som(String paraSom) {
		System.out.println("pocotó... pocotó...pocotó...É um cavalo!!!!");
	}

	@Override
	public void habilidade(String paraHab) {
		System.out.println("Ele tem a habilidade de correr");	
	}

}
