package com.kobylynskyi.pharmacy.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.kobylynskyi.pharmacy.entity.Drug;
import com.kobylynskyi.pharmacy.entity.Patient;
import com.kobylynskyi.pharmacy.entity.Prescription;
import com.kobylynskyi.pharmacy.repository.DrugRepository;
import com.kobylynskyi.pharmacy.repository.PatientRepository;
import com.kobylynskyi.pharmacy.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Resolver of Prescription fields
 *
 * @author bogdankobylinsky
 */
@Component
public class PrescriptionFieldsResolver implements GraphQLResolver<Prescription> {

    private PrescriptionRepository prescriptionRepository;
    private DrugRepository drugRepository;
    private PatientRepository patientRepository;

    @Autowired
    public PrescriptionFieldsResolver(PrescriptionRepository prescriptionRepository,
                                      DrugRepository drugRepository,
                                      PatientRepository patientRepository) {
        this.prescriptionRepository = prescriptionRepository;
        this.drugRepository = drugRepository;
        this.patientRepository = patientRepository;
    }

    public Drug drug(Prescription prescription) {
        return drugRepository.findOne(prescription.getDrugId());
    }

    public Patient patient(Prescription prescription) {
        return patientRepository.findOne(prescription.getPatientId());
    }
}
