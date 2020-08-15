package com.app.service;

import com.app.model.Company;
import com.app.model.Worker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {
    private final List<Company> companies = new ArrayList<>();

    public Company add(Company company) {
        companies.add(company);
        return company;
    }

    public List<Company> getAll() {
        return companies;
    }

    public Company getOne(String name) {
        return companies
                .stream()
                .filter(company -> company.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
