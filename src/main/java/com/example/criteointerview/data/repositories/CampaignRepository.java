package com.example.criteointerview.data.repositories;

import com.example.criteointerview.data.models.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Integer> {
    @Query(value = "SELECT * FROM campaigns WHERE CURDATE() >= DATE_ADD(start_date, INTERVAL -10 DAY)", nativeQuery = true)
    List<Campaign> findAllActive();
}
