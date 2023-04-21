package dispositivos;

public class ScannerConcreto extends Dispositivo implements Scanner {

		public ScannerConcreto(String numeroSerie) {
			super(numeroSerie);
		}

		@Override
		public void processarDoc(String doc) {
			System.out.println("Scanner processando: " + doc);
		}

		@Override
		public String scan() {
			return "Scanner - Conteúdo Digitalizado";
		}
}
