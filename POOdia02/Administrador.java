package AulaPOO;

public class Administrador extends Pessoas {
	private int Ajdcusto;
	

	public Administrador(String nome, String endereço, int telefone,int AjdCusto) {
		super(nome, endereço, telefone);
		this.Ajdcusto = AjdCusto;
		
	}


	public int getAjdcusto() {
		return Ajdcusto;
	}


	public void setAjdcusto(int ajdcusto) {
		Ajdcusto = ajdcusto;
		
	}

}
