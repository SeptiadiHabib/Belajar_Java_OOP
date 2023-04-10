public class PolymorphismeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Eko");
        employee.sayHello("Jajang");

        employee = new Manager("Eko");
        employee.sayHello("Jajang");

        employee = new VicePresident("Abdul");
        employee.sayHello("Jajang");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Jajang"));
        sayHello(new VicePresident("Abdul"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }

    }
}
