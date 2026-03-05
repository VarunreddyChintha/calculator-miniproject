
package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(CalculatorApplication.class, args);

		CalculatorService calculator =
				context.getBean(CalculatorService.class);

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== Scientific Calculator =====");
			System.out.println("1. Square Root");
			System.out.println("2. Factorial");
			System.out.println("3. Natural Log (ln)");
			System.out.println("4. Power");
			System.out.println("5. Exit");

			System.out.print("Select operation: ");

			int choice = scanner.nextInt();

			switch (choice) {

				case 1:
					System.out.print("Enter number: ");
					double num = scanner.nextDouble();
					System.out.println("Result = " + calculator.sqrt(num));
					break;

				case 2:
					System.out.print("Enter integer: ");
					int n = scanner.nextInt();
					System.out.println("Result = " + calculator.factorial(n));
					break;

				case 3:
					System.out.print("Enter number: ");
					double ln = scanner.nextDouble();
					System.out.println("Result = " + calculator.ln(ln));
					break;

				case 4:
					System.out.print("Enter base: ");
					double a = scanner.nextDouble();

					System.out.print("Enter exponent: ");
					double b = scanner.nextDouble();

					System.out.println("Result = " + calculator.power(a, b));
					break;

				case 5:
					System.out.println("Exiting Calculator...");
					System.exit(0);

				default:
					System.out.println("Invalid choice");
			}
		}
	}
}