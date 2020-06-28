package com.master.strategy_map_dictionary.builder;

import com.master.strategy_map_dictionary.bean.Receipt;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟一个回执生成器
 */
public class ReceiptBuilder {

    public static List<Receipt> generateReceiptList(){
        //直接模拟一堆回执对象
        List<Receipt> receiptList = new ArrayList<>();
        receiptList.add(new Receipt("我是MT2101回执喔","MT2101"));
        receiptList.add(new Receipt("我是MT1101回执喔","MT1101"));
        receiptList.add(new Receipt("我是MT8104回执喔","MT8104"));
        receiptList.add(new Receipt("我是MT9999回执喔","MT9999"));
        //......
        return receiptList;
    }
}