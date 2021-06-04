package com.example.brinkman.rewardsprogram.repository;

import com.example.brinkman.rewardsprogram.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
   // Purchase findByName(String name);
}
