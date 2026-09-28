class InventoryService {
    void updateStock() {
        System.out.println("Stock updated");
    }
}

class MaterialPlanner6 {
    void calculateMaterialNeeds() {
        System.out.println("Material requirements calculated");
    }
}

class InvoiceService {
    void createInvoice() {
        System.out.println("Invoice created");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        InventoryService inventory =
            new InventoryService();

        MaterialPlanner6 planner =
            new MaterialPlanner6();

        InvoiceService invoice =
            new InvoiceService();

        inventory.updateStock();
        planner.calculateMaterialNeeds();
        invoice.createInvoice();
    }
}