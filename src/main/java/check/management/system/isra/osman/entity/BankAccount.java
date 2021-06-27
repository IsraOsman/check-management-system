package check.management.system.isra.osman.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="bankaccount")
public class BankAccount {
	@Id
	@Column(name="account_number")
	private Long accountNumber;
	
	@Column(name="routing_number")
	private Long routingNumber;
	
	@Column(name="name")
	private String name;
	
	@Column(name="bank")
	private String bank;
	
	@Column(name="address")
	private String address;
	
	@Column(name="date")
	@CreationTimestamp
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="userId",nullable=false)
	private User user; 
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(Long accountNumber, Long routingNumber, String name, String bank, String address, Date date) {
		super();
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		this.name = name;
		this.bank = bank;
		this.address = address;
		this.date = date;
	}



	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Long getRoutingNumber() {
		return routingNumber;
	}



	public void setRoutingNumber(Long routingNumber) {
		this.routingNumber = routingNumber;
	}


	public User getUser() {
		return user;
	}


    public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getBank() {
		return bank;
	}
	
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Date getDate() {
		return date;
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", bank=" + bank + ", address=" + address + "]";
	}
	
	
	
}
