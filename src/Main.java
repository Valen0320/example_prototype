import model.ConcretePrototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original Object");
        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        clone1.setName("Clone 1");

        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        clone2.setName("Clone 2");

        System.out.println("Prototype name: " + prototype.getName());
        System.out.println("Clone 1 name: " + clone1.getName());
        System.out.println("Clone 2 name " + clone2.getName());
    }
}