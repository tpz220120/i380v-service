package com.weixin.po;

import java.util.Date;

public class BasePo implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	private String delete_flag;
	
	private String creator;
	
	private Date create_time;
	
	private String updater;
	
	private Date update_time;
	
	private String update_time_format;
	
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

//	public String getCreate_time_format() {
//		return create_time_format;
//	}
//
//	public void setCreate_time_format(String create_time_format) {
//		this.create_time_format = create_time_format;
//	}

	public String getUpdate_time_format() {
		return update_time_format;
	}

	public void setUpdate_time_format(String update_time_format) {
		this.update_time_format = update_time_format;
	}

	public String getDelete_flag() {
		return delete_flag;
	}

	public void setDelete_flag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
}
