package dispositivos;

public class ImpressoraConcreta extends Dispositivo implements Impressora {

	public ImpressoraConcreta(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Impressora Imprimindo: " + doc);
	}
}
