public class Control {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Prateek", 250.00),
            new Order("2", "Pragya", 150.00),
            new Order("3", "Ajit", 200.00),
            new Order("4", "Alka", 300.00)
        };

        // Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset array for Quick Sort
        orders = new Order[]{
            new Order("1", "Alka", 250.00),
            new Order("2", "Prateek", 150.00),
            new Order("3", "Pragya", 200.00),
            new Order("4", "Ajit", 300.00)
        };

        // Quick Sort
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
