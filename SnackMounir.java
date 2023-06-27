package learning_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SnackMounir {
	public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=minty&password=greatsqldb");
        while (true) {
            System.out.print("Libéllé de l'article (ou 'fin' pour terminer) : ");
            
            
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
        System.out.print("Mode de paiement : ");
        String modePaiement = scanner.nextLine();

        ticket.genererTicket();
        scanner.close();
    }
}
