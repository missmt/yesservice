package com.tnourji.commontools.repository;

import com.tnourji.commontools.model.GiftItem;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the GiftItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GiftItemRepository extends JpaRepository<GiftItem, Long> {

}
