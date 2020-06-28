package com.master.strategy_map_dictionary.interfaces;

/**
 *
 * 传统做法-if-else分支
 *
 * List<Receipt> receiptList = ReceiptBuilder.generateReceiptList();
 * //循环处理
 * for (Receipt receipt : receiptList) {
 *     if (StringUtils.equals("MT2101",receipt.getType())) {
 *         System.out.println("接收到MT2101回执");
 *         System.out.println("解析回执内容");
 *         System.out.println("执行业务逻辑");
 *     } else if (StringUtils.equals("MT1101",receipt.getType())) {
 *         System.out.println("接收到MT1101回执");
 *         System.out.println("解析回执内容");
 *         System.out.println("执行业务逻辑");
 *     } else if (StringUtils.equals("MT8104",receipt.getType())) {
 *         System.out.println("接收到MT8104回执");
 *         System.out.println("解析回执内容");
 *         System.out.println("执行业务逻辑");
 *     } else if (StringUtils.equals("MT9999",receipt.getType())) {
 *         System.out.println("接收到MT9999回执");
 *         System.out.println("解析回执内容");
 *         System.out.println("执行业务逻辑");
 *         System.out.println("推送邮件");
 *     }
 *     // ......未来可能还有好多个else if
 * }
 *
 * 在遇到if-else的分支业务逻辑比较复杂时，我们都习惯于将其抽出一个方法或者封装成一个对象去调用，
 * 这样整个if-else结构就不会显得太臃肿。
 *
 * 就上面例子，当回执的类型越来越多时，分支else if 就会越来越多，每增加一个回执类型，
 * 就需要修改或添加if-else分支，违反了开闭原则（对扩展开放，对修改关闭）
 */

/**
 * 策略模式+Map字典
 *
 * 我们知道， 策略模式的目的是封装一系列的算法，它们具有共性，可以相互替换，
 * 也就是说让算法独立于使用它的客户端而独立变化，客户端仅仅依赖于策略接口 。
 *
 * 在上述场景中，我们可以把if-else分支的业务逻辑抽取为各种策略，但是不可
 * 避免的是依然需要客户端写一些if-else进行策略选择的逻辑，我们可以将这段
 * 逻辑抽取到工厂类中去，这就是策略模式+简单工厂，代码如下
 *
 */

import com.master.strategy_map_dictionary.bean.Receipt;

/**
 * @Description: 回执处理策略接口
 * @Auther: zhangkai
 */
public interface IReceiptHandleStrategy {

    void handleReceipt(Receipt receipt);

}
