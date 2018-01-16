package com.kobylynskyi.pharmacy.service;

import com.kobylynskyi.pharmacy.entity.Prescription;
import com.kobylynskyi.pharmacy.repository.PrescriptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Slf4j
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

    public Prescription prescribe(String drugId, String patientId, String usage, int refills) {
        Prescription prescription = repository.save(new Prescription(null, drugId, patientId,
                DateTime.now(), usage, refills));
        log.info("Prescription was created: {}", prescription);
        return prescription;
    }
}
