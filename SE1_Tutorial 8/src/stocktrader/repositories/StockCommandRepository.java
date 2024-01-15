package stocktrader.repositories;

import java.util.ArrayList;

import stocktrader.model.entities.StockInformation;

public class StockCommandRepository {
    private ArrayList<StockInformation> userHistory;

    public ArrayList<StockInformation> getStockCommands() {
        return userHistory;
    }

    public boolean StoreStockCommands() {
        if (userHistory.isEmpty())
            return false;
        return true;
    }
}
