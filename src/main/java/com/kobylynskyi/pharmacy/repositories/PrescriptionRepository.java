package com.kobylynskyi.pharmacy.repositories;

import com.kobylynskyi.pharmacy.entities.Prescription;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository<Prescription, String> {

}
