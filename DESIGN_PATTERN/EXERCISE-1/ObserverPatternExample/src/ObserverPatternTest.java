public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(150.00);
        System.out.println();

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setPrice(200.00);
    }
}
