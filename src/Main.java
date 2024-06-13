import java.util.Scanner;
import aparelhos.Iphone;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Iphone iphone = new Iphone();

        String menu = "[1] TELEFONE \n"
        + "[2] MÚSICA \n"
        + "[3] INTERNET \n"
        + "[4] MENU \n"
        + "Opção: ";
		
		System.out.println(menu);	
		int resp = sc.nextInt();
		System.out.println("--------------------------------------");
		
		do {		
			switch (resp) {
			case 1: {	
				System.out.println(":::::: TELEFONE ::::::\n"
						+ "[1] LIGAR \n"
						+ "[2] ATENDER \n"
						+ "[3] INICIAR CORREIO DE VOZ \n"
						+ "[4] VOLTAR MENU \n"
                        + "Opção: "
						);
				int opcao = sc.nextInt();					
				
				if(opcao == 1) {
					System.out.print("DIGITE O NUMERO: ");
					String numero = sc.next();						
					iphone.ligar(numero);
				}
				else if(opcao == 2) {
					iphone.atender();
				}
				else if(opcao == 3){
					iphone.iniciarCorreioVoz();
				}
				else if(opcao == 4){
					resp = 4;
				}
				else {
					System.out.println("! OPÇÃO INVÁLIDA !");							
				}
				System.out.println("Deseja fechar? [S/N] ");	
				sc.nextLine();
				String fechar = sc.nextLine();
				if (fechar.toUpperCase().equals("S"))
					resp = 0;								
				continue;
            }
			
			case 2: {	
				System.out.println(":::::: MÚSICA ::::::\n"
						+ "[1] SELECIONAR MUSICA \n"
						+ "[2] TOCAR \n"
						+ "[3] PAUSAR \n"
						+ "[4] VOLTAR MENU \n"
                        + "Opção: "
						);
				int opcao = sc.nextInt();					
				
				if(opcao == 1) {
					System.out.print("QUAL MÚSICA DESEJA OUVIR? ");
					sc.nextLine();
					String musica = sc.nextLine();						
					iphone.selecionarMusica(musica);
				}
				else if(opcao == 2) {					
					iphone.tocar();					
				}
				else if(opcao == 3){
					iphone.pausar();
				}
				else if(opcao == 4){
					resp = 4;
				}
				else {
					System.out.println("! OPÇÃO INVÁLIDA !");							
				}	
				System.out.println("Deseja fechar? [S/N] ");	
				sc.nextLine();
				String fechar = sc.nextLine();
				if (fechar.toUpperCase().equals("S"))
					resp = 0;								
				continue;
			}
			case 3: {	
				System.out.println(":::::: NAVEGAR NA INTERNET ::::::\n"
						+ "[1] ACESSAR PAGINA WEB \n"
						+ "[2] ATUALIZAR PÁGINA \n"
						+ "[3] NOVA ABA \n"
						+ "[4] VOLTAR MENU \n"
                        + "Opção: "
						);
				int opcao = sc.nextInt();					
				
				if(opcao == 1) {
					System.out.println("DIGITE O ENDEREÇO WEB QUE DESEJA: ");
					sc.nextLine();
					String url = sc.nextLine();						
					iphone.exibirPagina(url);
				}
				else if(opcao == 2) {					
					iphone.atualizarPagina();					
				}
				else if(opcao == 3){
					iphone.abrirNovaAba();
				}
				else if(opcao == 4){
					resp = 4;
				}
				else {
					System.out.println("! OPÇÃO INVÁLIDA !");							
				}	
				System.out.println("Deseja fechar? [S/N] ");	
				sc.nextLine();
				String fechar = sc.nextLine();
				if (fechar.toUpperCase().equals("S"))
					resp = 0;						
				continue;
			}			
			case 4: {
				System.out.println(menu);	
				resp = sc.nextInt();
				System.out.println("---------------------------------");				
				break;
				}			
			}
					
		}while(resp != 0);
		
		System.out.println("MENU ENCERRADO. OBRIGADO!"
				+ "");			
		sc.close();			
    }
}
