package com.vmx.h2manage.controller;

import java.util.List;

import com.vmx.h2manage.payload.LabelValueResponse;
import com.vmx.h2manage.repository.CommonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommonController {

    @Autowired
    private CommonRepository commonRepository;


    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/common/countries")
//    @PreAuthorize("hasRole('USER')")
    public List<String> getCountryList() {
        return commonRepository.countryList();
    }

    @GetMapping("/common/states")
//    @PreAuthorize("hasRole('USER')")
    public List<LabelValueResponse> getStatesList() {
        return commonRepository.stateList();
    }

}