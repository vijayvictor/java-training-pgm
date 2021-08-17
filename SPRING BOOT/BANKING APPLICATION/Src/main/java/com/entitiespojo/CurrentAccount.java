package com.BankingApplication.EntitiesPojo;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Description of file CurrentAccount.java <br>
 * 
 * @author adem
 *
 *         It represents the current account in bank <br>
 *       
 */
@SuppressWarnings("serial")
@Entity
@DiscriminatorValue(value = "CA")
public class CurrentAccount extends Account {

	// decouvert
	private double overdraft;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountId, Date creationDate, double discount, Customer customer, double overdraft) {
		super(accountId, creationDate, discount, customer);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

}
