package com.kobylynskyi.pharmacy.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.kobylynskyi.pharmacy.entities.Drug;
import com.kobylynskyi.pharmacy.entities.Patient;
import com.kobylynskyi.pharmacy.entities.Prescription;
import com.kobylynskyi.pharmacy.repositories.DrugRepository;
import com.kobylynskyi.pharmacy.repositories.PatientRepository;
import com.kobylynskyi.pharmacy.repositories.PrescriptionRepository;

/**
 * Resolver for Prescription fields
 *
 * @author bogdankobylinsky
 */
public class PrescriptionResolver implements GraphQLResolver<Prescription> {

    private PrescriptionRepository prescriptionRepository;
    private DrugRepository drugRepository;
    private PatientRepository patientRepository;

    public PrescriptionResolver(PrescriptionRepository prescriptionRepository,
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
