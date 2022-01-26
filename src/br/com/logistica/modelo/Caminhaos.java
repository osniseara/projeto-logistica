package br.com.logistica.modelo;
import br.com.logistica.controller.Veiculos;

public class Caminhaos extends Veiculos {
	
	int eixo;
	
	public Caminhaos(String modelo, String placa, String cor,int ano, int eixo) {
		super(modelo, placa,ano, cor);
		this.eixo = eixo;
	}

	public int getEixo() {
		return eixo;
	}

	public void setEixo(int eixo) {
		this.eixo = eixo;
	}
	
	public void exibirDados() {
		System.out.println("O Caminhão de modelo:" + modelo + " de placa: " + placa + "E ano: " + ano + ", Número de eixos "+ eixo + " Se encontra no pátio.");
	}

}
