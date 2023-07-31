package com.example.criteointerview.domain.campaign;

import java.util.Date;
import java.util.Set;

public record CreateCampaignRequest(String name, Date startDate, float bid, Set<Integer> products) {
}
