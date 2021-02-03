package AulaPOO;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoas Anderson = new Pessoas("AndersonShow","Rua beco diagonal",123456789);
		Fornecedor Anderson2 = new Fornecedor("Anderson","Rua beco diagonal",987654321,500,300);
		
		Anderson2.imprimirinfo();
		Anderson2.obtersaldo();
		System.out.println("\n");
		Anderson.imprimirinf2();
		
		
	

	}

}
