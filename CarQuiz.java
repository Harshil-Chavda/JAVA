import java.util.HashMap;
import java.util.Map;

class StockManagementSystem {
    private Map<String, Integer> stock;

    public StockManagementSystem() {
        this.stock = new HashMap<>();
    }

    public void addStock(String item, int quantity) {
        if (stock.containsKey(item)) {
            int currentQuantity = stock.get(item);
            stock.put(item, currentQuantity + quantity);
        } else {
            stock.put(item, quantity);
        }
        System.out.println(quantity + " units of " + item + " added to stock.");
    }

    public void removeStock(String item, int quantity) {
        if (stock.containsKey(item)) {
            int currentQuantity = stock.get(item);
            if (currentQuantity >= quantity) {
                stock.put(item, currentQuantity - quantity);
                System.out.println(quantity + " units of " + item + " removed from stock.");
            } else {
                System.out.println("Insufficient stock for " + item);
            }
        } else {
            System.out.println(item + " is not in stock.");
        }
    }

    public int checkStock(String item) {
        return stock.getOrDefault(item, 0);
    }

    public void displayStock() {
        System.out.println("Current Stock:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StockManagementSystem stockSystem = new StockManagementSystem();
        
        // Adding stock
        stockSystem.addStock("Apple", 50);
        stockSystem.addStock("Banana", 30);
        stockSystem.addStock("Orange", 40);

        // Displaying current stock
        stockSystem.displayStock();

        // Removing stock
        stockSystem.removeStock("Apple", 20);
        stockSystem.removeStock("Banana", 40);

        // Displaying updated stock
        stockSystem.displayStock();
    }
}
