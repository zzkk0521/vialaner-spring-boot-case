package com.master.strategy_map_dictionary.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 物流行业中，通常会涉及到EDI报文(XML格式文件)传输和回执接收，每发送一份EDI报文，
 * 后续都会收到与之关联的回执（标识该数据在第三方系统中的流转状态）。
 *
 * 这里枚举几种回执类型：MT1101、MT2101、MT4101、MT8104、MT8105、MT9999，
 * 系统在收到不同的回执报文后，会执行对应的业务逻辑处理。
 * 当然，实际业务场景并没有那么笼统，这里以回执处理为演示案例
 *
 * 模拟一个回执类
 */
@Data
@AllArgsConstructor
public class Receipt {

    /**
     * 回执信息
     */
    String message;

    /**
     * 回执类型(`MT1101、MT2101、MT4101、MT8104、MT8105、MT9999`)
     */
    String type;

}
