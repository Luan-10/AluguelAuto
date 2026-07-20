package Entidades;

public class Fatura {

	public double pagamento;
	public double taxa;
	
	public Fatura(double pagamento, double taxa) {
		this.pagamento = pagamento;
		this.taxa = taxa;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double valorTotalPagamento() {
		return getPagamento() + getTaxa();
	}
	
	
}
