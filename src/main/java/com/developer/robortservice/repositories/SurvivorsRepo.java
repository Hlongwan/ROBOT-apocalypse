package com.developer.robortservice.repositories;
import com.developer.robortservice.entity.Survivor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SurvivorsRepo extends JpaRepository<Survivor, UUID> {

    List<Survivor> findByInfected(boolean b);
}
