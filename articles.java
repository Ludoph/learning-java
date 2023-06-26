package learning_java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Article {
    private String description;
    private int quantity;
    private double unitPrice;

    public Article(String description, int quantity, double unitPrice) {
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
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

    public void generateTicket() {
        double totalPrice = 0;

        System.out.println("==================== Ticket de caisse ====================");
        System.out.println("Libéllé\tQuantité\tPrix Unitaire\tTotal");

        for (Article article : articles) {
            System.out.printf("%s\t%d\t\t%.2f\t\t%.2f%n", 
            		article.getDescription(), 
            		article.getQuantity(),
            		article.getUnitPrice(), 
            		article.getTotalPrice());
            		totalPrice += article.getTotalPrice();
        }

        System.out.println("==========================================================");
        System.out.printf("Prix total : %.2f%n", totalPrice);
    }
}


