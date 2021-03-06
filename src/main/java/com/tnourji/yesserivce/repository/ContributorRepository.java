package com.tnourji.yesserivce.repository;

import org.springframework.stereotype.Repository;

import com.tnourji.yesserivce.model.Contributor;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the Contributor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ContributorRepository extends JpaRepository<Contributor, Long> {
    @Query("select distinct contributor from Contributor contributor left join fetch contributor.giftItems")
    List<Contributor> findAllWithEagerRelationships();

    @Query("select contributor from Contributor contributor left join fetch contributor.giftItems where contributor.id =:id")
    Contributor findOneWithEagerRelationships(@Param("id") Long id);

}
