package com.baeldung.lsol.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.baeldung.lsol.domain.model.Campaign;

public interface CampaignRepository {

    Optional<Campaign> findById(Long id);

    Campaign save(Campaign campaign);

    List<Campaign> findAll();
}
