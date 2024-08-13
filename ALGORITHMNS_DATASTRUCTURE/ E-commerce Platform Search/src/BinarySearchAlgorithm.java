import java.util.Arrays;

public class BinarySearchAlgorithm {

    // Binary Search (Assumes the array is sorted by productId)
    public static Product binarySearch(Product[] products, String searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId().equals(searchId)) {
                return products[mid];
            }
            if (products[mid].getProductId().compareTo(searchId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Product not found
    }
}
