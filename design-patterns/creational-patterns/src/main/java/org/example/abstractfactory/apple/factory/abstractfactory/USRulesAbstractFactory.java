package org.example.abstractfactory.apple.factory.abstractfactory;

import org.example.abstractfactory.apple.model.certificate.Certificate;
import org.example.abstractfactory.apple.model.certificate.USCertificate;
import org.example.abstractfactory.apple.model.packing.Packing;
import org.example.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    public Certificate getCertificates() {
        return new USCertificate();
    }

    public Packing getPacking() {
        return new USPacking();
    }
}
