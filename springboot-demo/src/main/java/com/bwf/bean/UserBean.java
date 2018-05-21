package com.bwf.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 实体模型层
 * 
 * @author Administrator
 *
 */

@Entity
@Table(name = "t_user", schema = "user1")
public class UserBean implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
	@SequenceGenerator(name = "userSeq", sequenceName = "seq_t_user", schema = "user1")
	private Integer tid;

	@Column
	private String uname;

	@Temporal(TemporalType.DATE)
	@Column(name = "birthday", nullable = false)
	private Date birthday;

	@Column
	private Double money;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "UserBean [tid=" + tid + ", uname=" + uname + ", birthday=" + birthday + ", money=" + money + "]\n";
	}

}
