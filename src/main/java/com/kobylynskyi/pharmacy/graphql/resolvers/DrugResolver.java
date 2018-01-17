package com.kobylynskyi.pharmacy.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kobylynskyi.pharmacy.entity.Drug;
import com.kobylynskyi.pharmacy.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Resolver of all Drug queries and mutations
 *
 * @author bogdankobylinsky
 */
@Component
public class DrugResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private DrugService service;

    public Iterable<Drug> findAllDrugs() {
        return service.findAllDrugs();
    }

    public Drug createDrug(String name, String manufacturer, String image) {
        return service.createDrug(name, manufacturer, image);
    }

}
