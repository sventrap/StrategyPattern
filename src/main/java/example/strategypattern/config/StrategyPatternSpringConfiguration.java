package example.strategypattern.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import example.strategypattern.strategies.api.Parser;
import example.strategypattern.strategies.impl.SabreParser;
import example.strategypattern.strategies.impl.WorldspanParser;
import example.strategypattern.strategies.util.GDS;

@Configuration
@ComponentScan(basePackages = { "example.strategypattern.api", "example.strategypattern.strategies.api",
		"example.strategypattern.impl", "example.strategypattern.strategies.impl" })
public class StrategyPatternSpringConfiguration {

	@Autowired
	@Qualifier(SabreParser.BEANNAME)
	private Parser sabreParser;

	@Autowired
	@Qualifier(WorldspanParser.BEANNAME)
	private Parser worldspanParser;

	@Bean
	public Map<GDS, Parser> parsers() {
		Map<GDS, Parser> parsers = new HashMap<GDS, Parser>();
		parsers.put(GDS.SABRE, sabreParser);
		parsers.put(GDS.WORLDSPAN, worldspanParser);
		return parsers;
	}
}
