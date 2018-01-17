package com.kobylynskyi.pharmacy.service;

import com.kobylynskyi.pharmacy.entity.Drug;
import com.kobylynskyi.pharmacy.repository.DrugRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author bogdankobylinsky
 */
@Slf4j
@Component
public class DrugService {

    private final DrugRepository repository;

    public DrugService(DrugRepository repository) {
        this.repository = repository;
    }

    public Iterable<Drug> findAllDrugs() {
        return repository.findAll();
    }

    public Drug createDrug(String name, String manufacturer, String image) {
        Drug drug = repository.save(new Drug(null, name, manufacturer, image));
        log.info("Drug was created: {}", drug);
        return drug;
    }
}
