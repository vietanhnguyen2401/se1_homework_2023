package stocktrader.model.repositories;

import stocktrader.model.entity.StockInformation;

import java.util.ArrayList;

public class UserRepository {
    private Double userMoney;
    private ArrayList<StockInformation> userStock;
    public ArrayList<StockInformation> getUserInfo(){
        return userStock;
    }
    public boolean storeUserInfo(){
        return !userStock.isEmpty() && userStock != null;
    }
    public double getUserMoney(){
        return userMoney;
    }
}
