package br.com.logistica.modelo;
import br.com.logistica.controller.Veiculos;

public class Carros extends Veiculos {
	
	String tipo;
	
	public Carros(String modelo, String placa, int ano, String cor, String tipo) {
		super(modelo, placa,ano,cor);
		this.tipo=tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setModelo(String tipo) {
		this.tipo = tipo;
	}
	
	public void exibirDados() {
		System.out.println("O carro de modelo"+ modelo + " e placa: " + placa + ", cor:" + cor + " E ano: " + ano + ", tipo "+ tipo + " Se encontra no pátio.");
	}

}
