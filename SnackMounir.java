package learning_java;

import java.util.Scanner;

public class SnackMounir {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();

        while (true) {
            System.out.print("Description de l'article (ou 'fin' pour terminer) : ");
            String description = scanner.nextLine();

            if (description.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Quantité : ");
            int quantite = scanner.nextInt();

            System.out.print("Prix unitaire : ");
            double prixUnitaire = scanner.nextDouble();

            scanner.nextLine();

            Article article = new Article(description, quantite, prixUnitaire);
            ticket.addArticle(article);
        }

        ticket.genererTicket();
        scanner.close();
    }
}
