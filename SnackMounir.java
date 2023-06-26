package learning_java;

import java.util.Scanner;

public class SnackMounir {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();

        while (true) {
            System.out.print("Description de l'article (ou 'exit' pour terminer) : ");
            String description = scanner.nextLine();

            if (description.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Quantité : ");
            int quantity = scanner.nextInt();

            System.out.print("Prix unitaire : ");
            double unitPrice = scanner.nextDouble();

            scanner.nextLine();

            Article article = new Article(description, quantity, unitPrice);
            ticket.addArticle(article);
        }

        ticket.generateTicket();
        scanner.close();
    }
}
