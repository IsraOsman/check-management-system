package check.management.system.isra.osman.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="cheque")
public class Cheque {

	@Id
	@Column(name="cheque_number")
	private Long chequeNumber;
	private Long amount;
	private String memo;
	
	@CreationTimestamp
	private Date date;
	
	
	@ManyToOne
	@JoinColumn(name="bankaccountId", nullable=false)
	private BankAccount account;
	
	@ManyToOne
	@JoinColumn(name="payeeId", nullable=false)
	private Payee payee; 
	
	@ManyToOne
	@JoinColumn(name="userId", nullable=false)
	private User user;	
	
	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cheque(Long chequeNumber, Long amount, String memo, Payee payee, Date date, BankAccount account, User user) {
		super();
		this.chequeNumber = chequeNumber;
		this.amount = amount;
		this.memo = memo;
		this.date = date;
		this.account = account;
		this.user = user;
		this.payee = payee;
	}

	public Long getChequeNumber() {
		return chequeNumber;
	}


	public void setChequeNumber(Long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}


	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Payee getPayee() {
		return payee;
	}

	public void setPayee(Payee payee) {
		this.payee = payee;
	}
	
	
	

}
