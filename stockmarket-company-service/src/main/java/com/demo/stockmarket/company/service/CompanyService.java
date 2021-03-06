package com.demo.stockmarket.company.service;

import org.springframework.data.domain.Page;

import java.util.List;

import com.demo.stockmarket.entity.Company;

public interface CompanyService {
	
	public Page<Company> getCompanies(int page, int pageSize);

	public List<Company> getCompanies();
	
	public Company addCompany(Company company);
	
	public Company updateCompany(Company company, int id);
	
	public void deleteCompany(int id);

	public Company getCompanyById(int id);

}
