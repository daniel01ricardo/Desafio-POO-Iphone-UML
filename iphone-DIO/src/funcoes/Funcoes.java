package funcoes;

import Funcionalidades.AparelhoTelefonico.Atender;
import Funcionalidades.AparelhoTelefonico.IniciarCorreioVoz;
import Funcionalidades.AparelhoTelefonico.Ligar;
import Funcionalidades.NavegadorInternet.AdicionarNovaAba;
import Funcionalidades.NavegadorInternet.AtualizarPagina;
import Funcionalidades.NavegadorInternet.ExibirPagina;
import Funcionalidades.ReprodutorMusical.Pausar;
import Funcionalidades.ReprodutorMusical.SelecionarMusica;
import Funcionalidades.ReprodutorMusical.Tocar;

public class Funcoes implements Atender, IniciarCorreioVoz, Ligar, ExibirPagina, Pausar, SelecionarMusica, Tocar {

	@Override
	public void ligando(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando");
	}

	@Override
	public void correiodeVoz() {
		// TODO Auto-generated method stub
		System.out.println("Correio de Voz");
	}

	@Override
	public void atende() {
		// TODO Auto-generated method stub
		System.out.println("Antender");
	}

	@Override
	public void toca() {
		// TODO Auto-generated method stub
		System.out.println("Tocar");
	}

	@Override
	public void musicaSelecionada(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionar Musica");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pausar Musica");
	}

	@Override
	public void paginaExibida(String url) {
		// TODO Auto-generated method stub
		System.out.println("Pagina Exibida");
	}

	}

