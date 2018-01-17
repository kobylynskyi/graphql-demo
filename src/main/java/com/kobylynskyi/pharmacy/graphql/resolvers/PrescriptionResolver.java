package com.kobylynskyi.pharmacy.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kobylynskyi.pharmacy.entity.Prescription;
import com.kobylynskyi.pharmacy.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Resolver of all Prescription queries
 *
 * @author bogdankobylinsky
 */
@Component
public class PrescriptionResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private PrescriptionService service;

    public Iterable<Prescription> findAllPrescriptions() {
        return service.findAllPrescriptions();
    }

    public Iterable<Prescription> findPrescriptions(String patientId) {
        return service.findPrescriptions(patientId);
    }

    public Prescription prescribe(String drugId, String patientId, String usage, Integer refills) {
        return service.prescribe(drugId, patientId, usage, refills);
    }

}
