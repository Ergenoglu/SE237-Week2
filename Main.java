class Product {
    private String name;

    Product(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }

    void rename(String newName) {
        name = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        Product a = new Product("CHAIR-A");
        Product b = a;

        b.rename("CHAIR-B");

        System.out.println("a: " + a.name());
        System.out.println("b: " + b.name());
    }
}