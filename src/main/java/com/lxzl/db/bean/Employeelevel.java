package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 用户级别.
 * 
 */
//@Entity
public class Employeelevel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	@GeneratedValue
	private Long elid;

	/** 标识. */
	private Integer level;

	/** 名称. */
	private String name;

	/** The set of 用户信息表. */
	private Set<Userlevel> userlevelSet;

	/**
	 * Constructor.
	 */
	public Employeelevel() {
		this.userlevelSet = new HashSet<Userlevel>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param elid
	 *            ID
	 */
	public void setElid(Long elid) {
		this.elid = elid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getElid() {
		return this.elid;
	}

	/**
	 * Set the 标识.
	 * 
	 * @param level
	 *            标识
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * Get the 标识.
	 * 
	 * @return 标识
	 */
	public Integer getLevel() {
		return this.level;
	}

	/**
	 * Set the 名称.
	 * 
	 * @param name
	 *            名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 名称.
	 * 
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the set of the 用户信息表.
	 * 
	 * @param userlevelSet
	 *            The set of 用户信息表
	 */
	public void setUserlevelSet(Set<Userlevel> userlevelSet) {
		this.userlevelSet = userlevelSet;
	}

	/**
	 * Add the 用户信息表.
	 * 
	 * @param userlevel
	 *            用户信息表
	 */
	public void addUserlevel(Userlevel userlevel) {
		this.userlevelSet.add(userlevel);
	}

	/**
	 * Get the set of the 用户信息表.
	 * 
	 * @return The set of 用户信息表
	 */
	public Set<Userlevel> getUserlevelSet() {
		return this.userlevelSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elid == null) ? 0 : elid.hashCode());
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
		Employeelevel other = (Employeelevel) obj;
		if (elid == null) {
			if (other.elid != null) {
				return false;
			}
		} else if (!elid.equals(other.elid)) {
			return false;
		}
		return true;
	}

}
