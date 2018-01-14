package com.kobylynskyi.pharmacy.repository;

import com.kobylynskyi.pharmacy.entity.Drug;
import org.springframework.data.repository.CrudRepository;

public interface DrugRepository extends CrudRepository<Drug, String> {

}
