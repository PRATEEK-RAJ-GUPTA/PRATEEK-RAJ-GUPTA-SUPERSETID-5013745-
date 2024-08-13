public class DependencyInjectionTest {
    public static void main(String[] args) {
        
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        String customer = customerService.getCustomer(45);
        System.out.println(customer);
    }
}
