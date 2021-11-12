package company;

import java.util.*;

public class Store {
    private final Collection<ContextProduct> contextProducts = new LinkedList<>();
    private String name;

    public Store(String name) {
        this.name = name;
    }

    public boolean addProduct(Product product, int ownPrice) {
        return contextProducts.add(new ContextProduct(product, ownPrice));
    }

    public boolean removeProduct(Product product) {
        ContextProduct contextProduct = new ContextProduct(product);
        return contextProducts.remove(contextProduct);
    }

    public Product getProduct(String name) {
        for (Iterator i = contextProducts.iterator(); i.hasNext(); ) {
            Object o = i.next();
            if (o instanceof Product product && product.getProdName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static class ContextProduct extends Product {
        double ownPrice;

        public ContextProduct(String prodName, int recommendedPrice, int ownPrice) {
            super(prodName, recommendedPrice);
            this.ownPrice = ownPrice;
        }

        public ContextProduct(Product product) {
            super(product.getProdName(), product.getRecommendedPrice());
        }

        public ContextProduct(Product product, int ownPrice) {
            this(product);
            this.ownPrice = ownPrice;
        }

        public double getOwnPrice() {
            return ownPrice;
        }

        public void setOwnPrice(double ownPrice) {
            this.ownPrice = ownPrice;
        }
    }
}
