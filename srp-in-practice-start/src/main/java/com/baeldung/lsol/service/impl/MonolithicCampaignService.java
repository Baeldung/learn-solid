package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Campaign;
import com.baeldung.lsol.domain.model.TaskStatus;
import com.baeldung.lsol.persistence.repository.CampaignRepository;

import java.util.Optional;

public class MonolithicCampaignService {

    private CampaignRepository campaignRepository;

    public MonolithicCampaignService(CampaignRepository campaignRepository) {
        super();
        this.campaignRepository = campaignRepository;
    }

    public Optional<Campaign> closeCampaign(Long id) {
        return campaignRepository.findById(id)
          .map(campaign -> {
            campaign.setClosed(true);
            campaign.getTasks()
                .forEach(task -> {
                    task.setStatus(TaskStatus.DONE);
                });
            return campaign;
          });
    }

    public void generateInvoice(Long id) {
        campaignRepository.findById(id)
          .ifPresent(campaign -> {
            // ... logic to calculate costs and notify finance team
            System.out.println("Generated invoice for " + campaign.getName());
          });
    }
}
