package com.practice.springboot.inventoryservice.repository;

import com.practice.springboot.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    public Optional<Inventory> findBySkuCode(String skuCode);


}
