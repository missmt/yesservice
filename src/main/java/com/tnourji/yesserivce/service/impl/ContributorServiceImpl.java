package com.tnourji.yesserivce.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tnourji.yesserivce.model.Contributor;
import com.tnourji.yesserivce.repository.ContributorRepository;
import com.tnourji.yesserivce.service.ContributorService;

import java.util.List;

/**
 * Service Implementation for managing Contributor.
 */
@Service
@Transactional
public class ContributorServiceImpl implements ContributorService{

    private final Logger log = LoggerFactory.getLogger(ContributorServiceImpl.class);

    private final ContributorRepository contributorRepository;

    public ContributorServiceImpl(ContributorRepository contributorRepository) {
        this.contributorRepository = contributorRepository;
    }

    /**
     * Save a contributor.
     *
     * @param contributor the entity to save
     * @return the persisted entity
     */
    @Override
    public Contributor save(Contributor contributor) {
        log.debug("Request to save Contributor : {}", contributor);
        return contributorRepository.save(contributor);
    }

    /**
     * Get all the contributors.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Contributor> findAll() {
        log.debug("Request to get all Contributors");
        return contributorRepository.findAllWithEagerRelationships();
    }

    /**
     * Get one contributor by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Contributor findOne(Long id) {
        log.debug("Request to get Contributor : {}", id);
        return contributorRepository.findOneWithEagerRelationships(id);
    }

    /**
     * Delete the contributor by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Contributor : {}", id);
        contributorRepository.delete(id);
    }
}
