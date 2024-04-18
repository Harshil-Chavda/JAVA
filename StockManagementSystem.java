import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Stock {
    private String symbol;
    private String name;
    private double price;

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Transaction {
    private String stockSymbol;
    private int quantity;
    private double totalPrice;

    public Transaction(String stockSymbol, int quantity, double totalPrice) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // Getters and setters
    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

class StockMarket {
    private Map<String, Stock> stocks;
    private List<Transaction> transactions;

    public StockMarket() {
        this.stocks = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.put(stock.getSymbol(), stock);
    }

    public void buyStock(String symbol, int quantity) {
        Stock stock = stocks.get(symbol);
        if (stock != null) {
            double totalPrice = stock.getPrice() * quantity;
            transactions.add(new Transaction(symbol, quantity, totalPrice));
            System.out.println(quantity + " shares of " + symbol + " bought for $" + totalPrice);
        } else {
            System.out.println("Stock with symbol " + symbol + " not found.");
        }
    }

    public void sellStock(String symbol, int quantity) {
        Stock stock = stocks.get(symbol);
        if (stock != null) {
            double totalPrice = stock.getPrice() * quantity;
            transactions.add(new Transaction(symbol, -quantity, -totalPrice));
            System.out.println(quantity + " shares of " + symbol + " sold for $" + totalPrice);
        } else {
            System.out.println("Stock with symbol " + symbol + " not found.");
        }
    }

    // Additional methods for managing stocks and transactions
}

class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock(new Stock("AAPL", "Apple Inc.", 150.50));
        stockMarket.addStock(new Stock("GOOGL", "Alphabet Inc.", 2800.75));

        stockMarket.buyStock("AAPL", 10);
        stockMarket.sellStock("GOOGL", 5);
    }
}
