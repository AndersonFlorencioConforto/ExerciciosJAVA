package AulaPOO;

public class Pregui�a extends Animal {

	public Pregui�a() {
		super("Dorminhoca", 15);
	}

	@Override
	public void som(String paraSom) {
		System.out.println("� uma pregui�a!!!!");
		
	}

	@Override
	public void habilidade(String paraHab) {
		System.out.println("Tem a habilidade de subir em �rvore");
	}

}
