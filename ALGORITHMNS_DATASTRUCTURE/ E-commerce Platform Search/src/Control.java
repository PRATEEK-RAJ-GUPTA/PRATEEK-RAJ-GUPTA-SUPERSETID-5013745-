import java.util.Arrays;

public class Control {
    public static void main(String[] args) {
        Product[] products = {
            new Product("3", "Laptop", "Electronics"),
            new Product("1", "Smartphone", "Electronics"),
            new Product("2", "Tablet", "Electronics")
        };

        // Sorting products by productId for binary search
        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));

        // Linear Search
        Product resultLinear = LinearSearchAlgorithm.linearSearch(products, "2");
        System.out.println("Linear Search Result: " + resultLinear);

        // Binary Search
        Product resultBinary = BinarySearchAlgorithm.binarySearch(products, "2");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
