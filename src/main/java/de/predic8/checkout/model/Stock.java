package de.predic8.checkout.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( value =  {"hibernateLazyInitializer", "handler"}, ignoreUnknown = true)
public class Stock {

	private String uuid;
    private long quantity;

	public Stock() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public long getQuantity() {
		return this.quantity;
	}

	public String toString() {
		return "Stock(uuid=" + uuid + ", quantity=" + quantity + ")";
	}
}