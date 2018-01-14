package com.kobylynskyi.pharmacy.repository;

import com.kobylynskyi.pharmacy.entity.Prescription;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository<Prescription, String> {

    Iterable<Prescription> findAllByPatientId(String patientId);

}
