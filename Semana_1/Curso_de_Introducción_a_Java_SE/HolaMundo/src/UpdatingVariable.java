public class UpdatingVariable {
    public static void main(String[] args) {
        // Actualizar datos numéricos:
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary); // 1200

        salary += 300;
        System.out.println(salary); // 1500

        // Actualizar variables de tipo String:
        String employeeName = "ivan ";
        employeeName = employeeName + "castañeda ";
        System.out.println(salary); // Anahí Salgado

        employeeName += "contreras";
        System.out.println(employeeName);

        employeeName = "Tu nombre es: " + employeeName;
        System.out.println(employeeName);
    }
}
