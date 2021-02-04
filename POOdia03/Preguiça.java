package AulaPOO;

public class Preguiça extends Animal {

	public Preguiça() {
		super("Dorminhoca", 15);
	}

	@Override
	public void som(String paraSom) {
		System.out.println("É uma preguiça!!!!");
		
	}

	@Override
	public void habilidade(String paraHab) {
		System.out.println("Tem a habilidade de subir em árvore");
	}

}
