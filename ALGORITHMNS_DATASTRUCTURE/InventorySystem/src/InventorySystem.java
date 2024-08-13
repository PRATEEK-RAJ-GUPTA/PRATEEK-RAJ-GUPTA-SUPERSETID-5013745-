import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private Map<String, Product> inventory;

    public InventorySystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }


    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();

        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 25, 499.99);

        system.addProduct(product1);
        system.addProduct(product2);

        System.out.println(system.getProduct("1"));
        System.out.println(system.getProduct("2"));

        product1.setPrice(899.99);
        system.updateProduct("1", product1);

        System.out.println(system.getProduct("1"));

        system.deleteProduct("2");
        System.out.println(system.getProduct("2"));
    }
}

// // Time Complexity:

// Add Operation: O(1) on average (HashMap)
// Update Operation: O(1) on average (HashMap) if the product ID is known
// Delete Operation: O(1) on average (HashMap) if the product ID is known

// Optimization:
// Hash Function: Use a good hash function to minimize collisions and ensure efficient retrieval.
// Capacity Management: Regularly review and adjust the capacity of the HashMap to maintain performance as the number of products grows.
// Concurrency: If multiple threads might access the inventory concurrently, consider using concurrent collections like ConcurrentHashMap.