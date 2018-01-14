package com.kobylynskyi.pharmacy.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kobylynskyi.pharmacy.entity.Prescription;
import com.kobylynskyi.pharmacy.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Resolver of all queries
 *
 * @author bogdankobylinsky
 */
@Component
public class PrescriptionQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PrescriptionService service;

    public Iterable<Prescription> findAllPrescriptions() {
        return service.findAllPrescriptions();
    }

    public Iterable<Prescription> findPrescriptions(String patientId) {
        return service.findPrescriptions(patientId);
    }

    public Long countPrescriptions() {
        return service.countPrescriptions();
    }

}
