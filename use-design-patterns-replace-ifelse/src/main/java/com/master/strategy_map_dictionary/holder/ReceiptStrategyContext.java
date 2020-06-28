package com.master.strategy_map_dictionary.holder;

import com.master.strategy_map_dictionary.bean.Receipt;
import com.master.strategy_map_dictionary.interfaces.IReceiptHandleStrategy;

/**
 * @Description: 策略上下文类(策略接口的持有者)，持有策略接口
 * @Auther: zhangkai
 */
public class ReceiptStrategyContext {

    private IReceiptHandleStrategy receiptHandleStrategy;

    /**
     * 设置策略接口
     * @param receiptHandleStrategy
     */
    public void setReceiptHandleStrategy(IReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    public void handleReceipt(Receipt receipt){
        if (receiptHandleStrategy != null) {
            receiptHandleStrategy.handleReceipt(receipt);
        }
    }
}
