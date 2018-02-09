package example.strategypattern.strategies.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import example.strategypattern.strategies.api.Parser;
import example.strategypattern.strategies.util.GDS;

@Service
@Qualifier(SabreParser.BEANNAME)
public class SabreParser implements Parser {

	public static final String BEANNAME = "SabreParser";
	private static final GDS GDSTYPE = GDS.SABRE;

	@Override
	public String parse(String pnr) {
		return new StringBuilder("Parsing ").append(pnr).append(" using ").append(GDSTYPE).append(" parser").toString();
	}

	public static GDS getGdstype() {
		return GDSTYPE;
	}
}
