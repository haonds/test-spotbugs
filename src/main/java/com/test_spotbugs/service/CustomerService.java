package com.test_spotbugs.service;

import com.test_spotbugs.entity.Customer;
import com.test_spotbugs.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public List<Long> GetAll(){
        return customerRepo.findAll().stream()
            .map(Customer::getId)
            .collect(Collectors.toList());
    }
}
