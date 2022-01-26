package br.com.logistica.controller;

public class Veiculos {
	protected String modelo;
	protected String placa;
	protected String cor;
	protected int ano;
	
	
	
	public Veiculos(String modelo, String placa, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}
	
	public Veiculos() {
		
	}
	
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDados(){
		System.out.println("O veiculo de placa: " + placa + "E ano : " + ano + " Se encontra no pátio.");
	}
}
