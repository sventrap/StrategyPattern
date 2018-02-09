package example.strategypattern.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.strategypattern.api.PnrProcessor;
import example.strategypattern.domain.Customer;
import example.strategypattern.strategies.api.Parser;
import example.strategypattern.strategies.util.GDS;

@Service
public class PnrProcessorImpl implements PnrProcessor {

	@Autowired
	Map<GDS, Parser> parsers;

	@Override
	public String parsePnr(String pnr, Customer cust) {
		Parser parser = parsers.get(cust.getGdsType());
		return parser.parse(pnr);
	}

}
