package com.practice.springboot.inventoryservice;

import com.practice.springboot.inventoryservice.model.Inventory;
import com.practice.springboot.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	// we will make an inventory object and put it in database so that we can check if the api that we are calling gives the right result or not
//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//
//		return args -> {
//
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_13");
//			inventory.setQuantity(100);
//
//			Inventory inventory1 = new Inventory();
//			inventory1.setSkuCode("iphone_13_red");
//			inventory1.setQuantity(0);
//
//			inventoryRepository.save(inventory1);
//			inventoryRepository.save(inventory);
//
//		};
//
//	}

}
