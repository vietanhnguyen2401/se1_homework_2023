package stocktrader.model.repositories;

import stocktrader.model.entity.Stock;

import java.util.ArrayList;
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
