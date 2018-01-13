package com.kobylynskyi.pharmacy.repositories;

import com.kobylynskyi.pharmacy.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, String> {

}
