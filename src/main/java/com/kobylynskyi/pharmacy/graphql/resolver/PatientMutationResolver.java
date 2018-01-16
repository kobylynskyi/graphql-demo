package com.kobylynskyi.pharmacy.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.kobylynskyi.pharmacy.entity.Patient;
import com.kobylynskyi.pharmacy.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Component
public class PatientMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private PatientService patientService;

    public Patient createPatient(String firstName, String lastName) {
        return patientService.addPatient(firstName, lastName, null);
    }
}
