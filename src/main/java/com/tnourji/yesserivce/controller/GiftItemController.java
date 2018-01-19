package com.tnourji.yesserivce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnourji.yesserivce.model.GiftItem;
import com.tnourji.yesserivce.service.GiftItemService;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing GiftItem.
 */
@RestController
@RequestMapping("/api")
public class GiftItemController {

    private final Logger log = LoggerFactory.getLogger(GiftItemController.class);

    private static final String ENTITY_NAME = "giftItem";

    private final GiftItemService giftItemService;

    public GiftItemController(GiftItemService giftItemService) {
        this.giftItemService = giftItemService;
    }

    /**
     * POST  /gift-items : Create a new giftItem.
     *
     * @param giftItem the giftItem to create
     * @return the ResponseEntity with status 201 (Created) and with body the new giftItem, or with status 400 (Bad Request) if the giftItem has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/gift-items")
    public void createGiftItem(@RequestBody GiftItem giftItem) throws URISyntaxException {
        log.debug("REST request to save GiftItem : {}", giftItem);
        GiftItem result = giftItemService.save(giftItem);
        
    }

    /**
     * PUT  /gift-items : Updates an existing giftItem.
     *
     * @param giftItem the giftItem to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated giftItem,
     * or with status 400 (Bad Request) if the giftItem is not valid,
     * or with status 500 (Internal Server Error) if the giftItem couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/gift-items")
    public void updateGiftItem(@RequestBody GiftItem giftItem) throws URISyntaxException {
        log.debug("REST request to update GiftItem : {}", giftItem);
        GiftItem result = giftItemService.save(giftItem);
    }    

    /**
     * GET  /gift-items : get all the giftItems.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of giftItems in body
     */
    @GetMapping("/gift-items")
    public List<GiftItem> getAllGiftItems() {
        log.debug("REST request to get all GiftItems");
        return giftItemService.findAll();
        }

    /**
     * GET  /gift-items/:id : get the "id" giftItem.
     *
     * @param id the id of the giftItem to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the giftItem, or with status 404 (Not Found)
     */
    @GetMapping("/gift-items/{id}")
    public GiftItem getGiftItem(@PathVariable Long id) {
        log.debug("REST request to get GiftItem : {}", id);
        GiftItem giftItem = giftItemService.findOne(id);
        return giftItem;
    }

    /**
     * DELETE  /gift-items/:id : delete the "id" giftItem.
     *
     * @param id the id of the giftItem to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/gift-items/{id}")
    public void deleteGiftItem(@PathVariable Long id) {
        log.debug("REST request to delete GiftItem : {}", id);
        giftItemService.delete(id);
       
    }
}
