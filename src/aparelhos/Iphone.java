package aparelhos;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void selecionarMusica(String musica) {		
		System.out.println("MÚSICA SELECIONADA: " + musica);
	}

    @Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA SELECIONADA...");		
	}
	
    @Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADA");		
	}

    @Override
	public void exibirPagina(String url) {
		System.out.println("ACESSANDO URL: " + url);
	}

    @Override
	public void atender() {		
		System.out.println("LIGAÇÃO ATENDIDA COM SUCESSO!");		
		System.out.println("LIGAÇÃO ATENDIDA ENCERRADA!");
	}

    @Override
	public void iniciarCorreioVoz() {		
		System.out.println("LIGAÇÃO RECUSADA! INICIANDO CORREIO DE VOZ...");
	}

    @Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA: " + numero);
		System.out.println("LIGAÇÃO CONCLUIDA COM SUCESSO!");
	}

    @Override
	public void atualizarPagina() {
		System.out.println("* PÁGINA ATUALIZADA *");
	}

    @Override
    public void abrirNovaAba() {
        System.out.println("* NOVA ABA ABERTA *");
    }
    
}
