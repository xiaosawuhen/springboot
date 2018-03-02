package com.lxzl.db.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 用户评价表.
 * 
 */
//@Entity
public class Userestimate implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	@GeneratedValue
	private Long id;

	/** 用户信息表. */
	private User user;

	/** 评价等级表. */
	private Employeeestimatelevel employeeestimatelevel;

	/**
	 * Constructor.
	 */
	public Userestimate() {
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
	 * Set the 用户信息表.
	 * 
	 * @param user
	 *            用户信息表
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Get the 用户信息表.
	 * 
	 * @return 用户信息表
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Set the 评价等级表.
	 * 
	 * @param employeeestimatelevel
	 *            评价等级表
	 */
	public void setEmployeeestimatelevel(Employeeestimatelevel employeeestimatelevel) {
		this.employeeestimatelevel = employeeestimatelevel;
	}

	/**
	 * Get the 评价等级表.
	 * 
	 * @return 评价等级表
	 */
	public Employeeestimatelevel getEmployeeestimatelevel() {
		return this.employeeestimatelevel;
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
		Userestimate other = (Userestimate) obj;
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
