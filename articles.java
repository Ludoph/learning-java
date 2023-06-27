package learning_java;


class Article {
	
    private String description;
    private int quantite;
    private double prixUnitaire;

    public Article(String description, int quantite, double prixUnitaire) {
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




