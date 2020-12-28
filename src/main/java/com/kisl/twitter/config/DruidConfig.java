package com.kisl.twitter.config;/**
 * Created by Administrator on 2020/12/22.
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.kisl.twitter.util.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/12/22 22:20
 * @Version 1.0.0
 */
@Configuration
public class DruidConfig {

    private Logger logger= LoggerFactory.getLogger(DruidConfig.class);
    /**
     * 初始化：注意在这如果不是从SpringProperties中读取配置信息，那么有可能注入不完整
     */
    @Bean(destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource() {
        logger.info("Druid初始化开始==========");
        DruidDataSource druidDataSource = new DruidDataSource();
        logger.info("Druid初始化完成==========");
        return druidDataSource;
    }


    @Bean
    public ServletRegistrationBean druidServlet(){
        ServletRegistrationBean servletRegistartionBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        // 白名单,多个用逗号分割， 如果allow没有配置或者为空，则允许所有访问
        servletRegistartionBean.addInitParameter("allow", "127.0.0.1");
        // 黑名单,多个用逗号分割 (共同存在时，deny优先于allow)
        servletRegistartionBean.addInitParameter("deny", "192.168.1.110");
        // 控制台管理用户名
        servletRegistartionBean.addInitParameter("loginUsername", "admin");
        // 控制台管理密码
        servletRegistartionBean.addInitParameter("loginPassword", "admin");
        // 是否可以重置数据源，禁用HTML页面上的“Reset All”功能
        servletRegistartionBean.addInitParameter("resetEnable", "false");
        return servletRegistartionBean;
    }

    /**
     * 定义Druid过滤规则
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean() ;
        filterRegistrationBean.setFilter(new WebStatFilter());
        //所有请求进行监控处理
        filterRegistrationBean.addUrlPatterns("/*");
        //        //添加不需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions", "*.html,*.js,*.gif,*.jpg,*.css,/druid/*");
        return filterRegistrationBean ;
    }
}
