package HybridInheritance;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Working as a Chef");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Working as a Waiter");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Worker c = new Chef("Rahul", 101);
        Worker w = new Waiter("Amit", 102);

        ((Person) c).displayPerson();
        c.performDuties();

        ((Person) w).displayPerson();
        w.performDuties();
    }
}
