package com.kobylynskyi.graphql.demo.prescription;

import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository<Prescription, String> {

}
