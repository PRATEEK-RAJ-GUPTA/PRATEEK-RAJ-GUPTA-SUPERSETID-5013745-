public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("1TB HDD")
            .build();

        System.out.println("Basic Computer:");
        System.out.println(basicComputer);

        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCardEnabled(true)
            .build();

        System.out.println("\nGaming Computer:");
        System.out.println(gamingComputer);
    }
}
