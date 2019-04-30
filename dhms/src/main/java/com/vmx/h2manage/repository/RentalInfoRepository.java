package com.vmx.h2manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.vmx.h2manage.model.RentalInfo;


@Repository
public interface RentalInfoRepository extends JpaRepository<RentalInfo, Long> {
}
