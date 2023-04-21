package aplicacao;

import dispositivos.CombinacaoDispositivos;
import dispositivos.ImpressoraConcreta;
import dispositivos.Scanner;
import dispositivos.ScannerConcreto;

public class Programa {

	public static void main(String[] args) {
		ImpressoraConcreta p = new ImpressoraConcreta("1080");
		p.processarDoc("Minha carta");
		p.imprimir("minha carta");
		System.out.println();
		
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processarDoc("Meu Email");
		System.out.println("Resultado do Scanner: " + s.scan());
		System.out.println();
		
		CombinacaoDispositivos c = new CombinacaoDispositivos("2081");
		c.processarDoc("Minha dissertação");
		c.imprimir("Minha dissertação");
		System.out.println("Resultado da Digitalização: " + c.scan());
	}

}
