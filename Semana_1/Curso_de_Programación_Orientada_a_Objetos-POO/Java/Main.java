package Java;

class Main {
    public static void main(String[] args) {
       // System.out.println("Hola Mundo");
        UberX uberX = new UberX("WEQ123", new Account("Raul Castañeda", "AWE987"), "Nissan", "Versa");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("WSA345", new Account("Lucy Contreras", "VFF123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

       UberX car2 = new UberX("QWE567", new Account("Andrea Herrera", "ANDA876"), "dds","aweea");
        car2.setPassenger(4);
        car2.printDataCar();
    }
}