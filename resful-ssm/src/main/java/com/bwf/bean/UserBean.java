package com.bwf.bean;

public class UserBean implements java.io.Serializable {
	private Integer tid;
	private String uname;
	private String birthday;
	private Double money;
	
	//扩展两个字段
	private boolean success;  //操作成功与否
	private String message;   //操作信息字符
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
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
