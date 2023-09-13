package Exemplo3;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 20;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		System.out.println("*Ligando o aparelho...*");
		 this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		System.out.println("*Desligando o aparelho...*");
		 this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("** Abrindo o menu **");
		System.out.println("Está ligado: " + this.isLigado());
		System.out.println("Está tocando: "+ this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		
	}

	@Override
	public void fecharMenu() {
		if(this.isLigado()) {
		
			System.out.println("*** Fechando o menu ***");
		
		}else {
			System.out.println("Não foi possivel fechar o menu");
			}
		
	}

	@Override
	public void aumentarVolume() {
		if(this.isLigado()) {
			if(this.getVolume() < 100) {
				this.setVolume(this.getVolume() + 5);
			}else {
				System.out.println("Volume está no maximo");
			}
		}else {
			System.out.println("Aparelho está desligado");
		}
		
	}

	@Override
	public void diminuirVolume() {
		if(this.isLigado()) {
			if(this.getVolume() >= 0) {
				this.setVolume(this.getVolume() - 5);
			}else {
				System.out.println("Volume está no minimo");
			}
		}else {
			System.out.println("Aparelho está desligado");
		}
		
	}

	@Override
	public void ativarMudo() {
		if(this.ligado && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desativarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
}
