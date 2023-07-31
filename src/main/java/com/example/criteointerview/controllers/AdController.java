package com.example.criteointerview.controllers;

import com.example.criteointerview.data.models.Product;
import com.example.criteointerview.domain.ad.AdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ads")
public class AdController {
    private final AdService adService;

    public AdController(AdService adService) {
        this.adService = adService;
    }

    @GetMapping("/{category}")
    public Product getAdForCategory(@PathVariable String category) {
        return adService.getMostProfitableProductInCategory(category);
    }
}
