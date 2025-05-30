package com.epam.functional.programming.optional;

import java.util.*;
import java.util.function.Supplier;

public class VendorApp {
	
	public static void main(String[] args) throws Exception {
		// Print Products from Vendor instance. Imagine that this is the response we are getting from Rest API.
	}

	private static Vendor scenarioWithAllProducts() {
		Map<String, String> productsMap = new HashMap<>();
		productsMap.put("P-011", "Treasury Intelligence");
		productsMap.put("P-012", "Portfolio optimizer");
		productsMap.put("P-013", "SpendingPulse™");
		productsMap.put("P-014", "PX-Security Pro");
		productsMap.put("P-015", "World Payments Advisory™");
		Product product = new Product(productsMap);
		Client client = new Client("Mastercard", product);
		return new Vendor("Epam Systems", client);
	}
	
	private static Vendor scenarioWithNoProductsMapForProduct() {
		Product product = new Product(null);
		Client client = new Client("Mastercard", product);
		return new Vendor("Epam Systems", client);
	}
	
	private static Vendor scenarioWithNoProductForClient() {
		Client client = new Client("Mastercard", null);
		return new Vendor("Epam Systems", client);
	}
	
	private static Vendor scenarioWithNoClientForVendor() {
		return new Vendor("Epam Systems", null);
	}
}
