package com.mars.common.base.config;

import com.mars.common.base.config.model.CrossDomainConfig;
import com.mars.common.base.config.model.FileUploadConfig;
import com.mars.common.base.config.model.JedisConfig;
import com.mars.common.base.config.model.ThreadPoolConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 配置信息
 */
public abstract class MarsConfig {

    /**
     * 端口号
     * @return 端口号
     */
    public int port(){
        return 8080;
    }

    /**
     * jwt失效时间
     * @return jwt失效时间
     */
    public int jwtTime(){
        return 86400;
    }

    /**
     * 线程池配置
     * @return 线程池配置
     */
    public ThreadPoolConfig getThreadPoolConfig(){
        return new ThreadPoolConfig();
    }

    /**
     * 上传文件大小配置
     * @return 上传文件大小配置
     */
    public FileUploadConfig fileUploadConfig(){
        return new FileUploadConfig();
    }

    /**
     * 跨域配置
     * @return 跨域配置
     */
    public CrossDomainConfig crossDomainConfig(){
        return new CrossDomainConfig();
    }

    /**
     * 连接池配置
     * @return 连接池配置
     */
    public List<Properties> jdbcProperties(){
        List<Properties> propertiesList = new ArrayList<Properties>();
        Properties properties = new Properties();
        properties.setProperty("name","default");
        propertiesList.add(properties);
        return propertiesList;
    }

    /**
     * jedis配置
     * @return jedis配置
     */
    public JedisConfig jedisConfig(){
        return new JedisConfig();
    }

    /**
     * 其他配置项
     * @return 配置
     */
    public Map<String,String> marsValues(){
        return null;
    }
}
