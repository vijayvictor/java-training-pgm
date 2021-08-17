package com.BankingApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.joran.spi.DefaultClass;

import com.BankingApplication.EntitiesPojo.Account;
import com.BankingApplication.EntitiesPojo.Operation;
import com.BankingApplication.Service.IBankService;

/**
 * Description of file BankController.java
 * 
 * @author 
 *
 *         It represents the controller of the spring MVC framework. <br>
 *
 */
@SuppressWarnings("unused")
@Controller
public class BankController {

	@Autowired
	private IBankService bankService;

	@RequestMapping("/home")
	public String toHome() {
		return "accounts";
	}

	@RequestMapping("/getAccount")
	public String getAccountById(@RequestParam(name = "accountId") String accountId, Model model,
			@RequestParam(name = "page", defaultValue = "0") int page) {
		model.addAttribute("accountIdModel", accountId);
		try {
			Account account = bankService.getAccountById(accountId);
			model.addAttribute("accountModel", account);
			Page<Operation> pageOperation = bankService.getAccountOperationByPage(accountId, page, 4);
			int pageNumber = pageOperation.getTotalPages();
			Integer[] pages = new Integer[pageNumber];
			for (int i = 0; i < pageNumber; i++) {
				pages[i] = i;
			}
			model.addAttribute("pageOperationsModel", pageOperation);
			model.addAttribute("pagesModel", pages);

		} catch (Exception e) {
			model.addAttribute("exceptionModel", e);
		}

		return "accounts";
	}

	@RequestMapping(value = "/saveAccountOperation", method = RequestMethod.POST)
	public String saveAccountOperation(Model model, String accountId, String operationType, String accountIdDest,
			@RequestParam(defaultValue = "0") double operationAmount) {
		try {
			if (operationType.equals("PAYMENT")) {
				bankService.payToAccount(accountId, operationAmount);
			} else if (operationType.equals("WITHDRAWAL")) {
				bankService.removeFromAccount(accountId, operationAmount);
			} else {
				bankService.transfer(accountId, accountIdDest, operationAmount);
			}
		} catch (Exception e) {
			model.addAttribute("errorModel", e);
			return "redirect:/getAccount?accountId=" + accountId + "&errorModel=" + e.getMessage();
		}

		return "redirect:/getAccount?accountId=" + accountId;
	}

}
