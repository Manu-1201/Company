package com.org.cts.master.service;

import com.org.cts.master.model.Company;

import java.util.List;

public interface ServiceInterface {
    public void addCompany(Company company);
    public void updateCompany(Company company);
    //public List<Company> getAllCompanies();
    //public Company findCompanyById(Integer id);
    //public String deleteByAddress(String companyLocation);
}
