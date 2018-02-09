package example.strategypattern.domain;

import example.strategypattern.strategies.util.GDS;

public class Customer {

	private String name;

	private GDS gdsType;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gdsType
	 */
	public GDS getGdsType() {
		return gdsType;
	}

	/**
	 * @param gdsType
	 *            the gdsType to set
	 */
	public void setGdsType(GDS gdsType) {
		this.gdsType = gdsType;
	}

}
