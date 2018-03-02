package com.lxzl.db.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 客户信息表.
 * 
 */
//@Entity
public class Customerinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	@GeneratedValue
	private Long id;

	/** 客户表. */
	private Customer ccustomer;

	/**
	 * Constructor.
	 */
	public Customerinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param id
	 *            ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Set the 客户表.
	 * 
	 * @param ccustomer
	 *            客户表
	 */
	public void setCcustomer(Customer ccustomer) {
		this.ccustomer = ccustomer;
	}

	/**
	 * Get the 客户表.
	 * 
	 * @return 客户表
	 */
	public Customer getCcustomer() {
		return this.ccustomer;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Customerinfo other = (Customerinfo) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
