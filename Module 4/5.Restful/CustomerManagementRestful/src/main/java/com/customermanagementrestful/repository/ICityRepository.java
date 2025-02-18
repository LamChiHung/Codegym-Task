package com.customermanagementrestful.repository;

import com.customermanagementrestful.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository <City, Integer> {
}
