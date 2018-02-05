package com.tnourji.yesserivces.controller;


import java.net.URISyntaxException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tnourji.yesserivces.model.Contributor;
import com.tnourji.yesserivces.service.ContributorService;

/**
 * REST controller for managing Contributor.
 */
@RestController

public class ContributorController {

    private final Logger log = LoggerFactory.getLogger(ContributorController.class);

    private static final String ENTITY_NAME = "contributor";
    @Autowired
    private ContributorService contributorService;

   /* public ContributorController(ContributorService contributorService) {
        this.contributorService = contributorService;
    }*/

    /**
     * POST  /contributors : Create a new contributor.
     *
     * @param contributor the contributor to create
     * @return the ResponseEntity with status 201 (Created) and with body the new contributor, or with status 400 (Bad Request) if the contributor has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    
    @RequestMapping(value = "/contributors", method = RequestMethod.GET)
    public void createContributor(@RequestBody Contributor contributor) throws URISyntaxException {
        log.debug("REST request to save Contributor : {}", contributor);
        //Contributor result = contributorService.save(contributor);
    }
//    }
//
//    /**
//     * PUT  /contributors : Updates an existing contributor.
//     *
//     * @param contributor the contributor to update
//     * @return the ResponseEntity with status 200 (OK) and with body the updated contributor,
//     * or with status 400 (Bad Request) if the contributor is not valid,
//     * or with status 500 (Internal Server Error) if the contributor couldn't be updated
//     * @throws URISyntaxException if the Location URI syntax is incorrect
//     */
//    @PutMapping("/contributors")
//    public void updateContributor(@RequestBody Contributor contributor) throws URISyntaxException {
//        log.debug("REST request to update Contributor : {}", contributor);
//        System.out.println("hello cc");
//       
//        Contributor result = contributorService.save(contributor);
//    }
//
//    /**
//     * GET  /contributors : get all the contributors.
//     *
//     * @return the ResponseEntity with status 200 (OK) and the list of contributors in body
//     */
//    @GetMapping("/contributors")
//    public List<Contributor> getAllContributors() {
//        log.debug("REST request to get all Contributors");
//        return contributorService.findAll();
//        }
//
//    /**
//     * GET  /contributors/:id : get the "id" contributor.
//     *
//     * @param id the id of the contributor to retrieve
//     * @return the ResponseEntity with status 200 (OK) and with body the contributor, or with status 404 (Not Found)
//     */
//    @GetMapping("/contributors/{id}")
//    public Contributor getContributor(@PathVariable Long id) {
//        log.debug("REST request to get Contributor : {}", id);
//        Contributor contributor = contributorService.findOne(id);
//        return contributor;
//       
//    }
//
//    /**
//     * DELETE  /contributors/:id : delete the "id" contributor.
//     *
//     * @param id the id of the contributor to delete
//     * @return the ResponseEntity with status 200 (OK)
//     */
//    @DeleteMapping("/contributors/{id}")
//    public void deleteContributor(@PathVariable Long id) {
//        log.debug("REST request to delete Contributor : {}", id);
//        contributorService.delete(id);
//        
//    }
}
