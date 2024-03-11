package org.example.abstractfactory.apple.factory.abstractfactory;

import org.example.abstractfactory.apple.model.certificate.Certificate;
import org.example.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
