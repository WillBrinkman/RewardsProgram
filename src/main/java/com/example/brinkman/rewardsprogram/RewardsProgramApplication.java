package com.example.brinkman.rewardsprogram;

import com.example.brinkman.rewardsprogram.model.Purchase;
import com.example.brinkman.rewardsprogram.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class RewardsProgramApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(RewardsProgramApplication.class, args);
	}
	@Autowired
	private PurchaseRepository purchaseRepository;

	@Override
	public void run(String... args) throws Exception{
		this.purchaseRepository.save(new Purchase(001, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(002, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(003, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(004, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(005, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(006, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(007, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(010, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(011, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
		this.purchaseRepository.save(new Purchase(012, 1, 111, LocalDate.of(2020, 1,2), "Blank"));
	}

}
