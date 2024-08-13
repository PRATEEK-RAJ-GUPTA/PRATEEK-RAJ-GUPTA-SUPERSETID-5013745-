public class LinearSearchAlgorithm {

    // Linear Search
    public static Product linearSearch(Product[] products, String searchId) {
        for (Product product : products) {
            if (product.getProductId().equals(searchId)) {
                return product;
            }
        }
        return null; // Product not found
    }
}
