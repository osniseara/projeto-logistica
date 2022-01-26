package br.com.logistica.modelo;
import br.com.logistica.controller.Veiculos;

public class Motos extends Veiculos {
	
	public Motos() {
		
	}
	
	public Motos(String modelo, String placa, int ano, String cor) {
		super(modelo, placa,ano,cor);
	}		

	public void exibirDados() {
		System.out.println("A moto de modelo"+ modelo + " e placa: " + placa + ", cor:" + cor + " E ano: " + ano + " Se encontra no pátio.");
	}
}
