package com.kobylynskyi.pharmacy.repository;

import com.kobylynskyi.pharmacy.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, String> {

}
