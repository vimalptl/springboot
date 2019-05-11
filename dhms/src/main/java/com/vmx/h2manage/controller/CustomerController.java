package com.vmx.h2manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.implementation.bind.annotation.Default;

import javax.validation.Valid;

import com.vmx.h2manage.model.Customer;
import com.vmx.h2manage.repository.CustomerRepository;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customer/{custid}")
    public Optional<Customer> getCustomer(@PathVariable(value = "custid") Integer custid) {
        return  customerRepository.findByCustId(custid);
    }


    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return  customerRepository.save(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return  customerRepository.save(customer);
    }

    @DeleteMapping("/customer/{custid}")
    public void deleteCustomer(@PathVariable(value = "custid") Integer id) {
        customerRepository.deleteById((long)id);
    }

    @GetMapping("/list")
    public Page<Customer> allCustomers(@RequestParam("page") int page, 
    @RequestParam("size") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Customer> pageList = customerRepository.findAll(pageable);
        return  pageList;
    }


    @GetMapping("/search")
    public List<Customer> searchCustomers(@RequestParam("firstname") String firstName, 
    @RequestParam("lastname") String lastName, @RequestParam("idnbr") String idNbr) {

        List<Customer> sc =  customerRepository.findByNameFirstOrNameLastOrIdNumber(firstName, lastName,
        idNbr);       
        return (List<Customer>) sc;
    }

}
