package com.BankingApplication.EntitiesPojo;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Description of file WithdrawalOperation <br>
 * 
 * @author adem
 *
 *         It represents a withdrawal operation for an account <br>
 */
@SuppressWarnings("serial")
@Entity
@DiscriminatorValue(value = "WO")
public class WithdrawlOperation extends Operation {

	public WithdrawlOperation() {
		super();
	}

	public WithdrawlOperation(Date operationDate, double amount, Account account) {
		super(operationDate, amount, account);
	}

}

