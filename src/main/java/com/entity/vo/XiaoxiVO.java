package com.entity.vo;

import com.entity.XiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 消息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-03 16:50:28
 */
public class XiaoxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 信息标题
	 */
	
	private String xinxibiaoti;
		
	/**
	 * url文字
	 */
	
	private String urlwenzi;
		
	/**
	 * 信息url
	 */
	
	private String xinxiurl;
		
	/**
	 * 信息内容
	 */
	
	private String xinxineirong;
		
	/**
	 * 发送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongshijian;
		
	/**
	 * 发送账号
	 */
	
	private String fasongzhanghao;
		
	/**
	 * 发送人
	 */
	
	private String fasongren;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：信息标题
	 */
	 
	public void setXinxibiaoti(String xinxibiaoti) {
		this.xinxibiaoti = xinxibiaoti;
	}
	
	/**
	 * 获取：信息标题
	 */
	public String getXinxibiaoti() {
		return xinxibiaoti;
	}
				
	
	/**
	 * 设置：url文字
	 */
	 
	public void setUrlwenzi(String urlwenzi) {
		this.urlwenzi = urlwenzi;
	}
	
	/**
	 * 获取：url文字
	 */
	public String getUrlwenzi() {
		return urlwenzi;
	}
				
	
	/**
	 * 设置：信息url
	 */
	 
	public void setXinxiurl(String xinxiurl) {
		this.xinxiurl = xinxiurl;
	}
	
	/**
	 * 获取：信息url
	 */
	public String getXinxiurl() {
		return xinxiurl;
	}
				
	
	/**
	 * 设置：信息内容
	 */
	 
	public void setXinxineirong(String xinxineirong) {
		this.xinxineirong = xinxineirong;
	}
	
	/**
	 * 获取：信息内容
	 */
	public String getXinxineirong() {
		return xinxineirong;
	}
				
	
	/**
	 * 设置：发送时间
	 */
	 
	public void setFasongshijian(Date fasongshijian) {
		this.fasongshijian = fasongshijian;
	}
	
	/**
	 * 获取：发送时间
	 */
	public Date getFasongshijian() {
		return fasongshijian;
	}
				
	
	/**
	 * 设置：发送账号
	 */
	 
	public void setFasongzhanghao(String fasongzhanghao) {
		this.fasongzhanghao = fasongzhanghao;
	}
	
	/**
	 * 获取：发送账号
	 */
	public String getFasongzhanghao() {
		return fasongzhanghao;
	}
				
	
	/**
	 * 设置：发送人
	 */
	 
	public void setFasongren(String fasongren) {
		this.fasongren = fasongren;
	}
	
	/**
	 * 获取：发送人
	 */
	public String getFasongren() {
		return fasongren;
	}
			
}
