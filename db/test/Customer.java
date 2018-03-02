package test;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 客户表.
 * 
 */
@Entity
public class Customer implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 客户ID. */
	@Id
	@GeneratedValue
	private Long id;

	/** 客户名称. */
	@Column(nullable=true)
	private String name;

	/** 密码. */
	@Column(nullable=true)
	private String password;

	/** 年龄. */
	@Column(nullable=true)
	private Integer age;

	/** 手机号. */
	@Column(nullable=true)
	private String phone;

	/** 邮箱. */
	@Column(nullable=true)
	private String email;

	/** The set of 客户信息表. */
	private Set<Customerinfo> customerinfoSet;

	/**
	 * Constructor.
	 */
	public Customer() {
		this.customerinfoSet = new HashSet<Customerinfo>();
	}

	/**
	 * Set the 客户ID.
	 * 
	 * @param id
	 *            客户ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Get the 客户ID.
	 * 
	 * @return 客户ID
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Set the 客户名称.
	 * 
	 * @param name
	 *            客户名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 客户名称.
	 * 
	 * @return 客户名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 密码.
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get the 密码.
	 * 
	 * @return 密码
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set the 年龄.
	 * 
	 * @param age
	 *            年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Get the 年龄.
	 * 
	 * @return 年龄
	 */
	public Integer getAge() {
		return this.age;
	}

	/**
	 * Set the 手机号.
	 * 
	 * @param phone
	 *            手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Get the 手机号.
	 * 
	 * @return 手机号
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Set the 邮箱.
	 * 
	 * @param email
	 *            邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the 邮箱.
	 * 
	 * @return 邮箱
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the set of the 客户信息表.
	 * 
	 * @param customerinfoSet
	 *            The set of 客户信息表
	 */
	public void setCustomerinfoSet(Set<Customerinfo> customerinfoSet) {
		this.customerinfoSet = customerinfoSet;
	}

	/**
	 * Add the 客户信息表.
	 * 
	 * @param customerinfo
	 *            客户信息表
	 */
	public void addCustomerinfo(Customerinfo customerinfo) {
		this.customerinfoSet.add(customerinfo);
	}

	/**
	 * Get the set of the 客户信息表.
	 * 
	 * @return The set of 客户信息表
	 */
	public Set<Customerinfo> getCustomerinfoSet() {
		return this.customerinfoSet;
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
		Customer other = (Customer) obj;
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
