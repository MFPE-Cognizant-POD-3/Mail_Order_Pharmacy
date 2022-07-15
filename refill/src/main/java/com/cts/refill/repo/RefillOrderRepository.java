package com.cts.refill.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.refill.model.RefillOrder;

public interface RefillOrderRepository extends JpaRepository<RefillOrder, Long> {
    
    
}
