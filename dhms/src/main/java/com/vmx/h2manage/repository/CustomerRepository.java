package com.vmx.h2manage.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.vmx.h2manage.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> , PagingAndSortingRepository<Customer, Long> {
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findByNameFirst(String firstName, Pageable pageable);
    Slice<Customer> findByNameFirstAndNameLast(String firstName, String lastName, Pageable pageable);
    List<Customer> findByNameFirstOrNameLastOrIdNumber(String firstName, String lastName, String idNbr);
}
