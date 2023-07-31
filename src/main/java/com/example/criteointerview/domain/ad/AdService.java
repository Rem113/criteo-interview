package com.example.criteointerview.domain.ad;

import com.example.criteointerview.data.models.Campaign;
import com.example.criteointerview.data.models.Product;
import com.example.criteointerview.domain.campaign.CampaignService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdService {
    private final CampaignService campaignService;

    public AdService(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    public Product getMostProfitableProductInCategory(String category) {
        List<Campaign> activeCampaigns = campaignService.getActiveCampaigns();
        activeCampaigns.sort((campaign1, campaign2) -> (int) (campaign2.getBid() - campaign1.getBid()));

        for (Campaign campaign : activeCampaigns) {
            for (Product product : campaign.getProducts()) {
                if (product.getCategory().equals(category)) {
                    return product;
                }
            }
        }

        return activeCampaigns.get(0).getProducts().iterator().next();
    }
}
