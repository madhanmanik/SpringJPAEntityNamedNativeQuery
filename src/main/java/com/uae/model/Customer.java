package com.uae.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema="dbo", catalog="xremit")
@NamedQuery(name = "Customer.fetchByAllData", query = "SELECT e FROM Customer e where id = :id")
public class Customer {

    @Id
    @Column(name = "id")
    private int id;
	 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Column(name = "name")
    private String name;
    
    @Column(name = "email")
	private String email;
    


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
