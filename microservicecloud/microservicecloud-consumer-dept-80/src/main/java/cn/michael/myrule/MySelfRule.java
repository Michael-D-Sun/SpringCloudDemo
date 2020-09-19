package cn.michael.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule  {
    @Bean
    IRule myRule() {
        return new CustomizeRandomRule();
    }
}
