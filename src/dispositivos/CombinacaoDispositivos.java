package dispositivos;

public class CombinacaoDispositivos extends Dispositivo implements Scanner, Impressora {

		public CombinacaoDispositivos(String numeroSerie) {
			super(numeroSerie);
		}

		@Override
		public void imprimir(String doc) {
			System.out.println("Impressão via Combo: " + doc);
		}

		@Override
		public String scan() {
			return "Resultado da digitalização via Combo";
		}

		@Override
		public void processarDoc(String doc) {
			System.out.println("Combo processando: " + doc);
		}
}
