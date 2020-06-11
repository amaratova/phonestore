package com.phonestore;

import java.util.ArrayList;
import java.util.List;

public class OrderList implements IList {

    @Override
    public List<PhoneOrder> ordersList(List<PhoneOrder> order) {
        List<PhoneOrder> orderID = new ArrayList<>();

        for(PhoneOrder phoneorder : order){
            if (phoneorder.orderID()){
                orderID.add(phoneorder);
            }
        }
        return orderID;
    }
}
