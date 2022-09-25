package com.org.cts.master.controller;

import com.org.cts.master.model.Company;
import com.org.cts.master.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/test")
public class CompanyController {
    @Autowired
    ServiceInterface serviceInterface;

    @PostMapping("/add")
    public void addCompany(@RequestBody Company company){
        serviceInterface.addCompany(company);

    }

    @PutMapping("/update")
    public void updateCompany(@RequestBody Company company){
        serviceInterface.updateCompany(company);
    }

    /*@GetMapping("/read")
    public List<Company> getAllCompanies(){
        List<Company> c = serviceInterface.getAllCompanies();
        return c;
    }*/
}
