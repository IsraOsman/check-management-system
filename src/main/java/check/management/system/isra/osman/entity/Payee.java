package check.management.system.isra.osman.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payee")
public class Payee {
	
	@Id
	@GeneratedValue
	private Long id;
	private String payeeName;
	
	public Payee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Payee(Long id, String payeeName) {
		super();
		this.id = id;
		this.payeeName = payeeName;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	@Override
	public String toString() {
		return "Payee [id=" + id + ", payeeName=" + payeeName + "]";
	}

}
