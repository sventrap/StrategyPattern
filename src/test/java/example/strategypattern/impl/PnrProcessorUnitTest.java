package example.strategypattern.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.strategypattern.api.PnrProcessor;
import example.strategypattern.config.TestConfiguration;
import example.strategypattern.domain.Customer;
import example.strategypattern.strategies.util.GDS;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
@ContextConfiguration(classes = { TestConfiguration.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class PnrProcessorUnitTest {

	@Autowired
	PnrProcessor pnrProcessor;

	@Test
	public void testParseSabrePnr() {
		String expectedString = "Parsing AirTickets using SABRE parser";
		Customer sabreCustomer = new Customer();
		sabreCustomer.setName("John");
		sabreCustomer.setGdsType(GDS.SABRE);
		String parsedPnr = pnrProcessor.parsePnr("AirTickets", sabreCustomer);

		Assert.assertEquals(expectedString, parsedPnr);
	}

	@Test
	public void testParseWorldspanPnr() {
		String expectedString = "Parsing RailTickets using WORLDSPAN parser";
		Customer sabreCustomer = new Customer();
		sabreCustomer.setName("Smith");
		sabreCustomer.setGdsType(GDS.WORLDSPAN);
		String parsedPnr = pnrProcessor.parsePnr("RailTickets", sabreCustomer);

		Assert.assertEquals(expectedString, parsedPnr);
	}
}
