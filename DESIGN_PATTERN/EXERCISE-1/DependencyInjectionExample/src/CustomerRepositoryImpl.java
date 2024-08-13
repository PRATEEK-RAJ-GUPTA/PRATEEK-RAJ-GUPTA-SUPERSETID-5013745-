public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate fetching customer from a database
        return "Customer with ID: " + id;
    }
}

