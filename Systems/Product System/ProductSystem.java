import java.util.ArrayList;
import java.util.List;
/** Product System - OOPs Implementation */
class Product {
    private int productId;
    private String name;
    private String description;
    private double price;
    private int quantity;

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int productId, String name, String description, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Add a display method to display product information
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------------------");
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product getProductById(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        Product product = getProductById(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
        }
    }


    // Correct the display method to iterate over all products
    public void display() {
        for (Product product : products) {
            product.display();
        }
    }
}

public class ProductSystem {
    public static void main(String[] args) {
        // Create a new product using the constructor
        Product product1 = new Product(1, "Laptop", "High-performance laptop", 999.99, 10);

        // Create an inventory and add the product
        Inventory inventory = new Inventory();
        inventory.addProduct(product1);

        // Retrieve product information by ID
        int productIdToSearch = 1;
        Product foundProduct = inventory.getProductById(productIdToSearch);

        if (foundProduct != null) {
            inventory.display();
        } else {
            System.out.println("Product not found.");
        }

    }
}
