package Model.Servico;

public class BrasilTaxServico {

	public double taxa(double valor) {
		if (valor >= 100) {
			return valor * 0.15;
		}
		if (valor < 100) {
			return valor * 0.20;
		}
		return valor;		
	}
}
