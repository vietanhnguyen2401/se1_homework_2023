package stocktrader.repositories;
import java.util.ArrayList;

import stocktrader.model.entities.Stock;
public class StockRepository {
    private ArrayList<Stock> stocks;

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public boolean StoreStocks() {
        if (stocks.isEmpty()) return false;
        return true;
    }
}
