package AulaPOO;

public class TestaAdministrador {

	public static void main(String[] args) {
		Administrador Anderson = new Administrador("AndersonShow","Rua beco diagonal",123456789,500);
		Anderson.imprimirinf2();
		System.out.println("Sua ajuda de custo é no valor de " +Anderson.getAjdcusto()+" reais");

	}

}
