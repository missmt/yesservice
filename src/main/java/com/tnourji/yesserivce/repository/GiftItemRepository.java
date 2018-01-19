package com.tnourji.yesserivce.repository;

import org.springframework.stereotype.Repository;

import com.tnourji.yesserivce.model.GiftItem;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the GiftItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GiftItemRepository extends JpaRepository<GiftItem, Long> {

}
