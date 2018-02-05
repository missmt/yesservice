package com.tnourji.yesserivces.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tnourji.yesserivces.model.GiftItem;
import com.tnourji.yesserivces.repository.GiftItemRepository;
import com.tnourji.yesserivces.service.GiftItemService;

import java.util.List;

/**
 * Service Implementation for managing GiftItem.
 */
@Service
@Transactional
public class GiftItemServiceImpl implements GiftItemService{

    private final Logger log = LoggerFactory.getLogger(GiftItemServiceImpl.class);

    private final GiftItemRepository giftItemRepository;

    public GiftItemServiceImpl(GiftItemRepository giftItemRepository) {
        this.giftItemRepository = giftItemRepository;
    }

    /**
     * Save a giftItem.
     *
     * @param giftItem the entity to save
     * @return the persisted entity
     */
    @Override
    public GiftItem save(GiftItem giftItem) {
        log.debug("Request to save GiftItem : {}", giftItem);
        return giftItemRepository.save(giftItem);
    }

    /**
     * Get all the giftItems.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<GiftItem> findAll() {
        log.debug("Request to get all GiftItems");
        return giftItemRepository.findAll();
    }

    /**
     * Get one giftItem by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public GiftItem findOne(Long id) {
        log.debug("Request to get GiftItem : {}", id);
        return giftItemRepository.findOne(id);
    }

    /**
     * Delete the giftItem by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete GiftItem : {}", id);
        giftItemRepository.delete(id);
    }
}
