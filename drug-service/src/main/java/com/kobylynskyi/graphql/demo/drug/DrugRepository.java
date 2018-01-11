package com.kobylynskyi.graphql.demo.drug;

import org.springframework.data.repository.CrudRepository;

public interface DrugRepository extends CrudRepository<Drug, String> {

}
