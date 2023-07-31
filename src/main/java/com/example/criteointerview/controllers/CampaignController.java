package com.example.criteointerview.controllers;

import com.example.criteointerview.data.models.Campaign;
import com.example.criteointerview.domain.campaign.CampaignService;
import com.example.criteointerview.domain.campaign.CreateCampaignRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public Campaign create(@RequestBody CreateCampaignRequest request) {
        return campaignService.create(request);
    }
}
