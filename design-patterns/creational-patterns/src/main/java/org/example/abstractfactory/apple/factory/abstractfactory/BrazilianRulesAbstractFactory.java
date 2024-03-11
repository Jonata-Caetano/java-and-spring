package org.example.abstractfactory.apple.factory.abstractfactory;

import org.example.abstractfactory.apple.model.certificate.BrazilianCertificate;
import org.example.abstractfactory.apple.model.certificate.Certificate;
import org.example.abstractfactory.apple.model.packing.BrazilianPacking;
import org.example.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
