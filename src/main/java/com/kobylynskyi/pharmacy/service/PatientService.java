package com.kobylynskyi.pharmacy.service;

import com.kobylynskyi.pharmacy.entity.Gender;
import com.kobylynskyi.pharmacy.entity.Patient;
import com.kobylynskyi.pharmacy.repository.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Slf4j
@Component
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Iterable<Patient> findAllPatients() {
        return repository.findAll();
    }

    public Patient addPatient(String firstName, String lastName, Gender gender) {
        Patient patient = repository.save(new Patient(null, firstName, lastName,
                gender == null ? Gender.UNKNOWN : gender));
        log.info("Patient was created: {}", patient);
        return patient;
    }
}
