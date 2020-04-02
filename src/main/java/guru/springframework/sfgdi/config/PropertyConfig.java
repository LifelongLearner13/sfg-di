package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
