package com.example.RentCollector.Repository;

import com.example.RentCollector.Pojo.TenantDeatils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TennantRepository extends JpaRepository<TenantDeatils,Long> {
}
