package example.strategypattern.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(StrategyPatternSpringConfiguration.class)
public class TestConfiguration {

}
