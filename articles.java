package learning_java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Article {
	
    private String description;
    private int quantite;
    private double prixUnitaire;

    public Article(String description, int quantite, double prixUniatire) {
        this.description = description;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }
    
	
	
	
    public double getTotal() {
        return quantite * prixUnitaire;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }
}

class Ticket {
    private List<Article> articles;

    public Ticket() {
        articles = new ArrayList<>();
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void genererTicket() {
        double totalPrice = 0;

        System.out.println("==================== Ticket de caisse ====================");
        System.out.println("Libéllé\tQuantité\tPrix Unitaire\tTotal");

        for (Article article : articles) {
            System.out.printf("%s\t%d\t\t%.2f\t\t%.2f%n", 
            		article.getDescription(), 
            		article.getQuantity(),
            		article.getPrixUnitaire(), 
            		article.getTotal());
            		totalPrice += article.getTotal();
        }

        System.out.println("==========================================================");
        System.out.printf("Prix total : %.2f%n", totalPrice);
    }
}


