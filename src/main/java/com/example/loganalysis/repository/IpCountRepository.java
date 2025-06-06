package com.example.loganalysis.repository;

import com.example.loganalysis.entity.IpCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpCountRepository extends JpaRepository<IpCount, String> {
}