package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.persistence.repository.CampaignRepository;
import com.baeldung.lsol.service.InvoiceService;

public class DefaultInvoiceService implements InvoiceService {

    private CampaignRepository campaignRepository;

    public DefaultInvoiceService(CampaignRepository campaignRepository) {
        super();
        this.campaignRepository = campaignRepository;
    }

    @Override
    public void generateInvoice(Long campaignId) {
        campaignRepository.findById(campaignId)
            .ifPresent(campaign -> {
                // ... logic to calculate costs and notify finance team
                System.out.println("Generated invoice for " + campaign.getName());
            });
    }
}