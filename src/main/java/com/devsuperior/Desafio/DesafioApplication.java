package com.devsuperior.Desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.devsuperior.entities.Order;
import com.devsuperior.service.OrderService;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	Scanner scanner = new Scanner(System.in);
	
	@Override
    public void run(String... args) throws Exception {
		System.out.println("Digite os dados do produto: ");
		System.out.print("Digite o código do produto: ");
		int code = scanner.nextInt();

		System.out.print("Digite o valor básico produtos: ");
		double basic = scanner.nextDouble();

		System.out.print("Digite o do desconto: ");
		double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);
		OrderService orderService = new OrderService();

		System.out.println("Código do produto" + code);
        double total = orderService.TotalValue(order);
        System.out.println("Total do pedido: R$ " + total);
    }
}