package Orienta��oOBJ;

public class Paciente {
	private String Nome;
	private String TipoSangue;
	private String Queixa;
	private int AnoNasc;
	
	public Paciente(String Nome,String Sangue,String Queixa,int AnoNasc) {
		this.Nome = Nome;
		this.TipoSangue = Sangue;
		this.Queixa = Queixa;
		this.AnoNasc =  AnoNasc;
	}
	
	public void imprimirInfo()
	{
		System.out.println(Nome+" possui o tipo sangu�neo "+TipoSangue+" Com os sintomas "+Queixa+" de "+(2021-AnoNasc)+" anos");
	}
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTipoSangue() {
		return TipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		TipoSangue = tipoSangue;
	}

	public String getQueixa() {
		return Queixa;
	}

	public void setQueixa(String queixa) {
		Queixa = queixa;
	}

	public int getAnoNasc() {
		return AnoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		AnoNasc = anoNasc;
	}
	
	
}
