package com.master.strategy_map_dictionary.interfaces.impl;

import com.master.strategy_map_dictionary.bean.Receipt;
import com.master.strategy_map_dictionary.interfaces.IReceiptHandleStrategy;

public class Mt2101ReceiptHandleStrategy implements IReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT2101:" + receipt.getMessage());
    }

}
