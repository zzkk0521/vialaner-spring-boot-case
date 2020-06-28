package com.master.strategy_map_dictionary.factory;

import com.master.strategy_map_dictionary.interfaces.IReceiptHandleStrategy;
import com.master.strategy_map_dictionary.interfaces.impl.Mt2101ReceiptHandleStrategy;
import com.master.strategy_map_dictionary.interfaces.impl.Mt8104ReceiptHandleStrategy;
import org.apache.commons.lang.StringUtils;

/**
 * @Description: 策略工厂
 * @Auther: zhangkai
 */
public class ReceiptHandleStrategyFactory {

    private ReceiptHandleStrategyFactory(){}

    public static IReceiptHandleStrategy getReceiptHandleStrategy(String receiptType){
        IReceiptHandleStrategy receiptHandleStrategy = null;
        if (StringUtils.equals("MT2101",receiptType)) {
            receiptHandleStrategy = new Mt2101ReceiptHandleStrategy();
        } else if (StringUtils.equals("MT8104",receiptType)) {
            receiptHandleStrategy = new Mt8104ReceiptHandleStrategy();
        }
        return receiptHandleStrategy;
    }

    /**
     * 由于我们的目的是消除if-else，那么这里需要将ReceiptHandleStrategyFactory策略工厂进行改造下，
     * 采用字典的方式存放我的策略，而Map具备key-value结构，采用Map是个不错选择。
     */
//    private static Map<String,IReceiptHandleStrategy> receiptHandleStrategyMap;
//
//    private ReceiptHandleStrategyFactory(){
//        this.receiptHandleStrategyMap = new HashMap<>();
//        this.receiptHandleStrategyMap.put("MT2101",new Mt2101ReceiptHandleStrategy());
//        this.receiptHandleStrategyMap.put("MT8104",new Mt8104ReceiptHandleStrategy());
//    }
//
//    public static IReceiptHandleStrategy getReceiptHandleStrategy(String receiptType){
//        return receiptHandleStrategyMap.get(receiptType);
//    }
}
