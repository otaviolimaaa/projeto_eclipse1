package exercicioos0603;

public class Exemplo4 {

	public static void main(String[] args) {
		String espacos = "ispaços";
		String corrigir = espacos.replace ("i", "e");
		
		String todosEspaços= "e s p a ç o";
		String tiraespaços = todosEspaços.replaceAll (" ", "");
		
		System.out.println("Antes: "+ espacos + "Depois: " + corrigir);
		System.out.println("Antes: "+ todosEspacos + "Depois" + tiraespacos );
	}

}
