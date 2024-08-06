public class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Web App: Stock price updated to " + price);
    }
}
