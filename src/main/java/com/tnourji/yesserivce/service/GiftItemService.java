package com.tnourji.yesserivce.service;

import java.util.List;

import com.tnourji.yesserivce.model.GiftItem;

/**
 * Service Interface for managing GiftItem.
 */
public interface GiftItemService {

    /**
     * Save a giftItem.
     *
     * @param giftItem the entity to save
     * @return the persisted entity
     */
    GiftItem save(GiftItem giftItem);

    /**
     * Get all the giftItems.
     *
     * @return the list of entities
     */
    List<GiftItem> findAll();

    /**
     * Get the "id" giftItem.
     *
     * @param id the id of the entity
     * @return the entity
     */
    GiftItem findOne(Long id);

    /**
     * Delete the "id" giftItem.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
