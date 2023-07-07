package learning_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SnackMounir {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        String modePaiement;
        
        
        
        Connection conn = null;
        try {
            conn =
               DriverManager.getConnection("jdbc:mysql://localhost/snack_mounir?" +
                                           "user=root&password=root");

            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        
        
        while (true) {
            System.out.print("Choix de l'article (ou 'fin' pour terminer) : \n");            
            String plat = scanner.nextLine();
            
            if (plat.equalsIgnoreCase("") || (plat.equalsIgnoreCase("fin"))) {
                break;
            }

            System.out.print("Quantité : ");
            int quantite = scanner.nextInt();

            System.out.print("Prix unitaire : ");
            double prixUnitaire = scanner.nextDouble();
            

            scanner.nextLine();

            Article article = new Article(plat, quantite, prixUnitaire);
            ticket.addArticle(article);
            
        }
        System.out.print("Mode de paiement : ");
        modePaiement = scanner.nextLine();
        ticket.setModePaiement(modePaiement);
        
        
        
        ticket.genererTicket();
        scanner.close();
    }
}
