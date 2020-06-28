package com.master.config;

import com.master.service.WrapService;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.UnknownHostException;

/**
 *配置文件中属性的封装类
 * 要读取并封装如下属性：
 *  wrap.service.prefix
 *  wrap.service.suffix
 *
 */
@Data
@ConfigurationProperties(prefix = "wrap.service")
public class WrapServiceProtorties {


    private String prefix;
    private String suffix;

}
