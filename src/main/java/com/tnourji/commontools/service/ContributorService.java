package com.tnourji.commontools.service;

import com.tnourji.commontools.model.Contributor;
import java.util.List;

/**
 * Service Interface for managing Contributor.
 */
public interface ContributorService {

    /**
     * Save a contributor.
     *
     * @param contributor the entity to save
     * @return the persisted entity
     */
    Contributor save(Contributor contributor);

    /**
     * Get all the contributors.
     *
     * @return the list of entities
     */
    List<Contributor> findAll();

    /**
     * Get the "id" contributor.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Contributor findOne(Long id);

    /**
     * Delete the "id" contributor.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
