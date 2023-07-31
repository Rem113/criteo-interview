package com.example.criteointerview.domain.campaign;

import com.example.criteointerview.data.models.Campaign;
import com.example.criteointerview.data.models.Product;
import com.example.criteointerview.data.repositories.CampaignRepository;
import com.example.criteointerview.data.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class CampaignService {
    private final CampaignRepository campaignRepository;
    private final ProductRepository productRepository;

    public CampaignService(CampaignRepository campaignRepository, ProductRepository productRepository) {
        this.campaignRepository = campaignRepository;
        this.productRepository = productRepository;
    }

    public Campaign create(CreateCampaignRequest request) {
        List<Product> products = productRepository.findAllById(request.products());
        return campaignRepository.save(new Campaign(request.name(), request.startDate(), request.bid(), new HashSet<>(products)));
    }

    public List<Campaign> getActiveCampaigns() {
        return campaignRepository.findAllActive();
    }
}
