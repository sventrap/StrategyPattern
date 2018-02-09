package example.strategypattern.api;

import example.strategypattern.domain.Customer;

public interface PnrProcessor {

	public String parsePnr(String pnr, Customer cust);
}
