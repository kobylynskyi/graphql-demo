package com.kobylynskyi.pharmacy.service;

import com.kobylynskyi.pharmacy.entity.Gender;
import com.kobylynskyi.pharmacy.entity.Patient;
import com.kobylynskyi.pharmacy.repository.PatientRepository;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Component
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Patient addPatient(String firstName, String lastName, Gender gender) {
        return repository.save(new Patient(null, firstName, lastName,
                gender == null ? Gender.UNKNOWN : gender));
    }
}
