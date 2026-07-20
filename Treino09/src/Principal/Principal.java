package Principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Aluguel;
import Entidades.Veiculo;
import Model.Servico.BrasilTaxServico;
import Model.Servico.ServicoAluguel;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel:");

		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		Aluguel cr = new Aluguel(start, finish, new Veiculo(carModel));
		

		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();

		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();

		ServicoAluguel rentalService = new ServicoAluguel(
		    pricePerHour,
		    pricePerDay,
		    new BrasilTaxServico()
		);

		rentalService.fatura(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + cr.getFatura().getPagamento());
		System.out.println("Imposto: " + cr.getFatura().getTaxa());
		System.out.println("Pagamento total: " + cr.getFatura().valorTotalPagamento());

		sc.close();
	}
}
