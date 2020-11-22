package com.kr.study.dto;

public class UserInfo {

	private String id;
	private String password;
	private String name;
	private int age;
	private String reg_date;
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}
	/**
	 * @param reg_date セットする reg_date
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}


}
