package com.kobylynskyi.pharmacy.service;

import com.kobylynskyi.pharmacy.entity.Prescription;
import com.kobylynskyi.pharmacy.repository.PrescriptionRepository;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Component
public class PrescriptionService {

    private final PrescriptionRepository repository;

    public PrescriptionService(PrescriptionRepository repository) {
        this.repository = repository;
    }

    public Iterable<Prescription> findAllPrescriptions() {
        return repository.findAll();
    }

    public Iterable<Prescription> findPrescriptions(String patientId) {
        return repository.findAllByPatientId(patientId);
    }

    public Long countPrescriptions() {
        return repository.count();
    }
}
