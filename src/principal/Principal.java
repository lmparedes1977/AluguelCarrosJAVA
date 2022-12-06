package principal;

import java.util.Scanner;

import menuprojeto.Menu;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Menu.bemVindo();
				
		String resp = sc.next();
		
		if (!resp.equals("0")) {
			Menu.opcoesCliente();			
			Menu.opcoesAdmin();					
			Menu.opcoesVendedor();			
		}

	}

}
