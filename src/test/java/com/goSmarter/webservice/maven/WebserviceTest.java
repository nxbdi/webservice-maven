package com.goSmarter.webservice.maven;

import static org.junit.Assert.assertTrue;
import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;

import org.junit.Test;

public class WebserviceTest {

	@Test
	public void test() {
		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
		
		assertTrue(currencyConvertor.getCurrencyConvertorSoap().conversionRate(Currency.INR, Currency.USD) >  0.0D);	
	}

}
