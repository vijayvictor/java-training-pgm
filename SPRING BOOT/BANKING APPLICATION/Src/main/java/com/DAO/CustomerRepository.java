package com.BankingApplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.BankingApplication.DAO.CustomerRepository;
import com.BankingApplication.EntitiesPojo.Customer;


@SuppressWarnings("unused")

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
