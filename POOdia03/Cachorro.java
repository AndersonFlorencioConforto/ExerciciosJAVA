package AulaPOO;

public class Cachorro extends Animal {

	public Cachorro() {
		super("Billy", 3);
		
	}

	@Override
	public void som(String paraSom) {
		System.out.println("Au...au... au... au...É um cachorro!!!!");	
	}

	@Override
	public void habilidade(String paraHab) {
		System.out.println("O seu cachorro tem habilidade de correr");
	}

}
