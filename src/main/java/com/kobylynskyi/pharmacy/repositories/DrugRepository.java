package com.kobylynskyi.pharmacy.repositories;

import com.kobylynskyi.pharmacy.entities.Drug;
import org.springframework.data.repository.CrudRepository;

public interface DrugRepository extends CrudRepository<Drug, String> {

}
