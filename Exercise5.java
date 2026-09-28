import java.util.Map;

class InventorySnapshot5 {
    private final Map<String, Long> quantities;

    InventorySnapshot5(Map<String, Long> quantities) {
        this.quantities = Map.copyOf(quantities);
    }

    long available(String componentCode) {
        return quantities.getOrDefault(componentCode, 0L);
    }
}

class StockViewer {
    private final InventorySnapshot5 stock;

    StockViewer(InventorySnapshot5 stock) {
        this.stock = stock;
    }

    void showWood() {
        System.out.println(
            "Viewer remembers WOOD-A: "
            + stock.available("WOOD-A")
        );
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        InventorySnapshot5 stock =
            new InventorySnapshot5(
                Map.of("WOOD-A", 3000L)
            );

        StockViewer viewer =
            new StockViewer(stock);

        viewer.showWood();
        viewer.showWood();
    }
}