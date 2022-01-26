package br.com.logistica.modelo;
import br.com.logistica.controller.Veiculos;

public class Onibus extends Veiculos {
	int assentos;

	
	public Onibus(String modelo, String placa, String cor, int ano, int assentos) {
		super(modelo, placa, ano,cor);
		this.assentos = assentos;
	}
	
	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	@Override
	public  void exibirDados() {
		
		System.out.println("O ônibus de modelo: " + modelo + " de placa: " + placa + ", cor: " + cor + ", ano: " + ano + ",Com o número de assentos "+ assentos + " Se encontra no pátio.");
		
	}
}
