package br.com.logistica.teste;
import java.util.ArrayList;

import br.com.logistica.modelo.Caminhaos;
import br.com.logistica.modelo.Carros;
import br.com.logistica.modelo.Motos;
import br.com.logistica.modelo.Onibus;

public class Teste {
	
	public static void main(String[] args) {
		

	
	ArrayList<Onibus> bus = new ArrayList<Onibus>();
	bus.add(new Onibus("Mercedes","CKS-1238","Branco", 2010, 22));
	
	ArrayList<Caminhaos> autoCaminhao = new ArrayList<Caminhaos>();
	autoCaminhao.add(new Caminhaos("Scania","LTS-123","Azul", 2015,1));
	
	ArrayList<Carros> autoCarros = new ArrayList<Carros>();
	autoCarros.add(new Carros("Honda fit","KJD-1234", 2015, "Preto", "compacto"));
	
	ArrayList<Motos> autoMotos = new ArrayList<Motos>();
	autoMotos.add(new Motos("Yamaha", "NNN-2344", 2010, "Branca"));
	
	
	
	
	
//	for(Veiculos veiculo : veiculos) {
//		veiculo.exibirDados();
//	}
	
	for(Onibus onibus: bus) {
		onibus.exibirDados();
	}
	
	for (Caminhaos Caminhaos: autoCaminhao) {
		Caminhaos.exibirDados();
		
	}
	
	for (Carros Carros: autoCarros){
		Carros.exibirDados();
	}
	
	for (Motos Motos: autoMotos) {
		Motos.exibirDados();
	}
	
	}

}
