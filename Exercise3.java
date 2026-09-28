import java.util.ArrayList;
import java.util.List;

class BomLine3 {
    private final String componentCode;
    private final long quantityPerUnit;
    private final int lossPercent;

    BomLine3(String componentCode, long quantityPerUnit, int lossPercent) {
        if (quantityPerUnit <= 0) {
            throw new IllegalArgumentException(
                "quantityPerUnit must be positive"
            );
        }

        if (lossPercent < 0 || lossPercent >= 100) {
            throw new IllegalArgumentException(
                "lossPercent must be between 0 and 99"
            );
        }

        this.componentCode = componentCode;
        this.quantityPerUnit = quantityPerUnit;
        this.lossPercent = lossPercent;
    }

    String componentCode() {
        return componentCode;
    }
}

class BomRevision {
    private final List<BomLine3> lines;

    BomRevision(List<BomLine3> lines) {
        this.lines = List.copyOf(lines);
    }

    List<BomLine3> lines() {
        return lines;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        List<BomLine3> original = new ArrayList<>();

        original.add(
            new BomLine3("WOOD-A", 20, 5)
        );

        BomRevision revision =
            new BomRevision(original);

        System.out.println("Before change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());

        original.add(
            new BomLine3("GLUE-A", 2, 0)
        );

        System.out.println("After change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());
        revision.lines().clear();
    }
}