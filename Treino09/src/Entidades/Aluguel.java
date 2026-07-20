package Entidades;

import java.time.LocalDateTime;
import java.time.Duration;

public class Aluguel {
	
	
	public LocalDateTime dataInicio;
	public LocalDateTime dataFim;
	
	public Fatura fatura;
	public Veiculo veiculo;
	
	public Aluguel() {}

	public Aluguel(LocalDateTime dataInicio, LocalDateTime dataFim, Veiculo veiculo) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.veiculo = veiculo;
	}


    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Duration calculoData() {
		return Duration.between(getDataInicio(), getDataFim());
	}

}
