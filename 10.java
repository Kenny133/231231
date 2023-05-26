public class Laptop {
    private String brand;
    private String model;
    private double screenSize;
    private String processorType;

    public Laptop(String brand, String model, double screenSize, String processorType) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.processorType = processorType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[3];
        laptops[0] = new Laptop("Dell", "Inspiron", 15.6, "Intel Core i5");
        laptops[1] = new Laptop("Acer", "Aspire", 14.0, "AMD Ryzen 5");
        laptops[2] = new Laptop("HP", "Pavilion", 13.3, "Intel Core i7");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите бренд ноутбука:");
        String brand = scanner.nextLine();
        System.out.println("Введите размер экрана ноутбука:");
        double screenSize = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите тип процессора ноутбука:");
        String processorType = scanner.nextLine();

        List<Laptop> matches = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equalsIgnoreCase(brand)
                    && laptop.getScreenSize() == screenSize
                    && laptop.getProcessorType().equalsIgnoreCase(processorType)) {
                matches.add(laptop);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("Нет соответствий");
        } else {
            System.out.println("Найдены соответствующие ноутбуки:");
            for (Laptop laptop : matches) {
                System.out.println(laptop.getBrand() + " " + laptop.getModel());
            }
        }
    }
}