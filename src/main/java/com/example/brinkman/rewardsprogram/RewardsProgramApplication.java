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
        this.purchaseRepository.save(new Purchase(1, 1, 111.12, LocalDate.of(2020, 1,5), "BBQ Grill"));
        this.purchaseRepository.save(new Purchase(2, 1, 62.33, LocalDate.of(2020, 1,14), "Speakers"));
        this.purchaseRepository.save(new Purchase(3, 1, 82.52, LocalDate.of(2020, 1,27), "Vacuum"));
        this.purchaseRepository.save(new Purchase(4, 1, 37.15, LocalDate.of(2020, 2,14), "T-shirt"));
        this.purchaseRepository.save(new Purchase(5, 1, 59.99, LocalDate.of(2020, 2,22), "Air Purifier"));
        this.purchaseRepository.save(new Purchase(6, 1, 134.22, LocalDate.of(2020, 2,28), "OLED TV"));
        this.purchaseRepository.save(new Purchase(7, 1, 10.42, LocalDate.of(2020, 3,2), "Baseball cap"));
        this.purchaseRepository.save(new Purchase(8, 1, 38.21, LocalDate.of(2020, 3,15), "Down Comforter"));
        this.purchaseRepository.save(new Purchase(9, 2, 140.15, LocalDate.of(2020, 1,4), "Dinner Table"));
        this.purchaseRepository.save(new Purchase(10, 2, 54.21, LocalDate.of(2020, 1,11), "Tire"));
        this.purchaseRepository.save(new Purchase(11, 2, 78.22, LocalDate.of(2020, 1,25), "Headphones"));
        this.purchaseRepository.save(new Purchase(12, 2, 160.21, LocalDate.of(2020, 2,7), "Car Radio"));
        this.purchaseRepository.save(new Purchase(13, 2, 35.67, LocalDate.of(2020, 2,12), "Jeans"));
        this.purchaseRepository.save(new Purchase(14, 2, 70.77, LocalDate.of(2020, 3,6), "Nightstand"));
        this.purchaseRepository.save(new Purchase(15, 2, 104.61, LocalDate.of(2020, 3,11), "Trombone"));
        this.purchaseRepository.save(new Purchase(16, 3, 44.99, LocalDate.of(2020, 1,2), "Lamp"));
        this.purchaseRepository.save(new Purchase(17, 3, 13.54, LocalDate.of(2020, 1,6), "Chocolate"));
        this.purchaseRepository.save(new Purchase(18, 3, 60.28, LocalDate.of(2020, 2,5), "Humidifier"));
        this.purchaseRepository.save(new Purchase(19, 3, 35.55, LocalDate.of(2020, 2,16), "Electric toothbrush"));
        this.purchaseRepository.save(new Purchase(20, 3, 82.15, LocalDate.of(2020, 2,26), "Armoire"));
        this.purchaseRepository.save(new Purchase(21, 3, 20.59, LocalDate.of(2020, 3,4), "Smoked Salmon"));
        this.purchaseRepository.save(new Purchase(22, 3, 5.28, LocalDate.of(2020, 3,12), "Pillow"));
        this.purchaseRepository.save(new Purchase(23, 3, 26.13, LocalDate.of(2020, 3,16), "Fishing Rod"));
        this.purchaseRepository.save(new Purchase(24, 4, 108.15, LocalDate.of(2020, 1,1), "Watch"));
        this.purchaseRepository.save(new Purchase(25, 4, 125.75, LocalDate.of(2020, 1,19), "Fridge"));
        this.purchaseRepository.save(new Purchase(26, 4, 15.14, LocalDate.of(2020, 1,25), "Candles"));
        this.purchaseRepository.save(new Purchase(27, 4, 52.18, LocalDate.of(2020, 2,11), "Pizza Stone"));
        this.purchaseRepository.save(new Purchase(28, 4, 14.16, LocalDate.of(2020, 2,16), "Smoked Gouda"));
        this.purchaseRepository.save(new Purchase(29, 4, 61.23, LocalDate.of(2020, 3,22), "Basketball"));
        this.purchaseRepository.save(new Purchase(30, 5, 58.99, LocalDate.of(2020, 1,16), "Guitar"));
        this.purchaseRepository.save(new Purchase(31, 5, 23.65, LocalDate.of(2020, 2,12), "Corn"));
        this.purchaseRepository.save(new Purchase(32, 5, 81.27, LocalDate.of(2020, 3,24), "Chair"));
        this.purchaseRepository.save(new Purchase(33, 6, 136.65, LocalDate.of(2020, 1,14), "Oven"));
        this.purchaseRepository.save(new Purchase(34, 6, 71.54, LocalDate.of(2020, 2,24), "Blankets"));
        this.purchaseRepository.save(new Purchase(35, 6, 16.25, LocalDate.of(2020, 3,18), "Salsa"));

    }

}
