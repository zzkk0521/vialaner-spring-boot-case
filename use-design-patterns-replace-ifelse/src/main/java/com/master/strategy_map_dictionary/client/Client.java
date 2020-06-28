package com.master.strategy_map_dictionary.client;

import com.master.strategy_map_dictionary.bean.Receipt;
import com.master.strategy_map_dictionary.builder.ReceiptBuilder;
import com.master.strategy_map_dictionary.factory.ReceiptHandleStrategyFactory;
import com.master.strategy_map_dictionary.holder.ReceiptStrategyContext;
import com.master.strategy_map_dictionary.interfaces.IReceiptHandleStrategy;

import java.util.List;


/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //模拟回执
        List<Receipt> receiptList = ReceiptBuilder.generateReceiptList();
        //策略上下文
        ReceiptStrategyContext receiptStrategyContext = new ReceiptStrategyContext();
        for (Receipt receipt : receiptList) {
            //获取并设置策略
            IReceiptHandleStrategy receiptHandleStrategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            receiptStrategyContext.setReceiptHandleStrategy(receiptHandleStrategy);
            //执行策略
            receiptStrategyContext.handleReceipt(receipt);
        }
    }
}
