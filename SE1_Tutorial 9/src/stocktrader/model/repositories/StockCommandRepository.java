package stocktrader.model.repositories;

import stocktrader.model.entity.StockInformation;

import java.util.ArrayList;

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
