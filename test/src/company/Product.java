package company;

import java.util.Objects;

public class Product {
    private String prodName;
    private int recommendedPrice;

    public Product(String prodName) {
        this.prodName = prodName;
    }

    public Product(String prodName, int recommendedPrice) {
        this.prodName = prodName;
        this.recommendedPrice = recommendedPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getRecommendedPrice() {
        return recommendedPrice;
    }

    public void setRecommendedPrice(int recommendedPrice) {
        this.recommendedPrice = recommendedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(prodName, product.prodName);
    }

    @Override
    public int hashCode() {
        return prodName.hashCode();
    }
}
