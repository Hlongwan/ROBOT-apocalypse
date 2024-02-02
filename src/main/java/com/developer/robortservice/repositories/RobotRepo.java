package com.developer.robortservice.repositories;

import com.developer.robortservice.entity.Robot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RobotRepo extends JpaRepository<Robot, UUID> {

}
