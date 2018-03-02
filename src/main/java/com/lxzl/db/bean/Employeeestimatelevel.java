package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 评价等级表.
 * 
 */
//@Entity
public class Employeeestimatelevel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	@GeneratedValue
	private Long eelid;

	/** 分数. */
	private Long grade;

	/** 类型. */
	private String type;

	/** The set of 用户评价表. */
	private Set<Userestimate> userestimateSet;

	/**
	 * Constructor.
	 */
	public Employeeestimatelevel() {
		this.userestimateSet = new HashSet<Userestimate>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param eelid
	 *            ID
	 */
	public void setEelid(Long eelid) {
		this.eelid = eelid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getEelid() {
		return this.eelid;
	}

	/**
	 * Set the 分数.
	 * 
	 * @param grade
	 *            分数
	 */
	public void setGrade(Long grade) {
		this.grade = grade;
	}

	/**
	 * Get the 分数.
	 * 
	 * @return 分数
	 */
	public Long getGrade() {
		return this.grade;
	}

	/**
	 * Set the 类型.
	 * 
	 * @param type
	 *            类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get the 类型.
	 * 
	 * @return 类型
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Set the set of the 用户评价表.
	 * 
	 * @param userestimateSet
	 *            The set of 用户评价表
	 */
	public void setUserestimateSet(Set<Userestimate> userestimateSet) {
		this.userestimateSet = userestimateSet;
	}

	/**
	 * Add the 用户评价表.
	 * 
	 * @param userestimate
	 *            用户评价表
	 */
	public void addUserestimate(Userestimate userestimate) {
		this.userestimateSet.add(userestimate);
	}

	/**
	 * Get the set of the 用户评价表.
	 * 
	 * @return The set of 用户评价表
	 */
	public Set<Userestimate> getUserestimateSet() {
		return this.userestimateSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eelid == null) ? 0 : eelid.hashCode());
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
		Employeeestimatelevel other = (Employeeestimatelevel) obj;
		if (eelid == null) {
			if (other.eelid != null) {
				return false;
			}
		} else if (!eelid.equals(other.eelid)) {
			return false;
		}
		return true;
	}

}
