package Model.Servico;

import java.time.Duration;

import Entidades.Aluguel;
import Entidades.Fatura;

public class ServicoAluguel {

	public double precoPorHora;
	public double precoPorDia;
	public BrasilTaxServico taxa;
	
	public ServicoAluguel(double precoPorHora, double precoPorDia, BrasilTaxServico taxa) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxa = taxa;
	}
	
	public void fatura(Aluguel aluguel) {
		
		double minutes;
		
		minutes = Duration.between(aluguel.getDataInicio(), aluguel.getDataFim()).toMinutes();
		double hours = minutes / 60.0;

		double basicPayment;
		if (hours <= 12.0) {
		    basicPayment = precoPorHora * Math.ceil(hours);
		}
		else {
		    basicPayment = precoPorDia * Math.ceil(hours / 24.0);
		}

		double tax = taxa.taxa(basicPayment);

		aluguel.setFatura(new Fatura(basicPayment, tax));
		
	}
}
