package com.example.brinkman.rewardsprogram.controller;


import com.example.brinkman.rewardsprogram.model.Purchase;
import com.example.brinkman.rewardsprogram.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping("/purchases")
    List<Purchase> getPurchases(){

        return purchaseRepository.findAll();
    }

}
