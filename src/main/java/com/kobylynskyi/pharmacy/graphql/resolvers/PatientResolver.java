package com.kobylynskyi.pharmacy.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kobylynskyi.pharmacy.entity.Patient;
import com.kobylynskyi.pharmacy.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Resolver of all Patient queries and mutations
 *
 * @author bogdankobylinsky
 */
@Component
public class PatientResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private PatientService service;

    public Iterable<Patient> findAllPatients() {
        return service.findAllPatients();
    }

    public Patient createPatient(String firstName, String lastName) {
        return service.createPatient(firstName, lastName, null);
    }

}
