package com.org.cts.master.service;

import com.org.cts.master.model.Company;
import com.org.cts.master.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.List;
@Service
public class ServiceClass implements ServiceInterface{
    @Autowired
    CompanyRepo companyRepo;

    @Override
    public void addCompany(Company company){
        companyRepo.save(company);
    }

    @Override
    public void updateCompany(Company company) {
        companyRepo.save(company);
    }
}
