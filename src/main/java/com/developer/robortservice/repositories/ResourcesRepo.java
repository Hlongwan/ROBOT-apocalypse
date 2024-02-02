package com.developer.robortservice.repositories;
import com.developer.robortservice.entity.Resource;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ResourcesRepo extends JpaRepository<Resource, UUID> {

    List<Resource> findByType(String robot);
}
