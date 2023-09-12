package com.emtiazmalik.accounts.configurations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("accounts")
@Getter @Setter @ToString
public class AppProperties {
    @Value("${spring.datasource.url2}")
    private String url;
    private String appName;
    private String envName;
}
