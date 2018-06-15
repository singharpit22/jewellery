package com.rbpd.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rbpd.entity.AuditAwareEntity;

@Entity
@Table(name = "account")
public class Account extends AuditAwareEntity {
	
	private static final long serialVersionUID = -6525373681898019873L;

	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	
	@Column(name = "account_number", nullable = false)
	private Long accountNumber;
	
	@Column(name = "account_type", nullable = false)
	private String accountType;
	
	@Column(name = "account_branch", nullable = false)
	private String accountBranch;
	
	@Column(name = "account_status", nullable = false)
	private String accountStatus;
	
	@Column(name = "account_balance", nullable = false)
	private Double accountBalance;
	
	@Column(name = "color_code", nullable = false)
	private String colourCode;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountBranch() {
		return accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getColourCode() {
		return colourCode;
	}

	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}
	
	
}
