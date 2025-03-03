package com.customer.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KYCDetailsRepository extends JpaRepository<Long, com.customer.entities.KYCDetails> {
}
