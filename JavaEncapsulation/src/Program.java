public class Program {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "ModelX", (short) 2022);

        tesla.setMake("Hyundai");
        tesla.setModel("Sonata");
        tesla.setYear((short) 2013);

        System.out.println(tesla.getModel());
        System.out.println(tesla.getMake());
        System.out.println(tesla.getYear());
    }
}
