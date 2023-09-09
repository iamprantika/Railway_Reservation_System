package com.rrs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrs.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Long> {
}
