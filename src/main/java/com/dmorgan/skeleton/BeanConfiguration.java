package com.dmorgan.skeleton;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by dmorgan on 7/16/14.
 */
@Configuration
@EnableAutoConfiguration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.altisource.rules.provider")
public class BeanConfiguration {

    private static Log LOGGER = LogFactory.getLog(Application.class);

    @Bean
    public ServletContextListener listener() {
        return new ServletContextListener() {
            @Override
            public void contextInitialized(ServletContextEvent sce) {
                LOGGER.info("ServletContext initialized");
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
                LOGGER.info("ServletContext destroyed");
            }
        };
    }
}
