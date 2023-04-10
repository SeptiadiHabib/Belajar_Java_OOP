public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Eko");
        manager.name = "Eko";
        manager.sayHello("Jajang");

        var vp = new VicePresident("Abdul");
        vp.sayHello("Jajang");
        System.out.println(manager);
        System.out.println(vp);
    }
}
