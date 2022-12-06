package menuprojeto;

public class Menu {	
			
	public static void bemVindo() {
		
		System.out.println("==================================================");
		System.out.println(" BEM VINDO AO SISTEMA JAVA DE ALUGUEL DE VEÍCULOS");
		System.out.println("==================================================");
		System.out.println("PARA INICIAR DIGITE SEU CPF OU '0' PARA SAIR: ");
				
	}
	
	public static void opcoesCliente() {
		System.out.println();
		System.out.println("DIGITE O NR. DA OPÇÃO DESEJADA: ");
		System.out.println("[1] - ALUGUEL DE VEÍCULO");
		System.out.println("[2] - DEVOLVER VEÍCULO");
	}
	
	public static void opcoesAdmin() {
		System.out.println();
		System.out.println("DIGITE O NR. DA OPÇÃO DESEJADA: ");
		System.out.println("[1] - CADASTRAR CLIENTE");
		System.out.println("[2] - REMOVER CLIENTE");
		System.out.println("[3] - CADASTRAR VEÍCULO");
		System.out.println("[4] - REMOVER VEÍCULO");
		System.out.println("[5] - CADASTRAR VENDEDOR");
		System.out.println("[6] - REMOVER VENDEDOR");
	}
	
	public static void opcoesVendedor() {
		System.out.println();
		System.out.println("DIGITE O NR. DA OPÇÃO DESEJADA: ");
		System.out.println("[1] - BUSCAR VEÍCULO");
		System.out.println("[2] - STATUS CONTRACHEQUE");
	}




}
