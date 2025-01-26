package com.entity.vo;

import com.entity.WenzhangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 文章信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-03 16:50:28
 */
public class WenzhangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章标题
	 */
	
	private String wenzhangbiaoti;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 文件名称
	 */
	
	private String wenjianmingcheng;
		
	/**
	 * 关键字
	 */
	
	private String guanjianzi;
		
	/**
	 * 文章概述
	 */
	
	private String wenzhanggaishu;
		
	/**
	 * 文章详情
	 */
	
	private String wenzhangxiangqing;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
				
	
	/**
	 * 设置：文章标题
	 */
	 
	public void setWenzhangbiaoti(String wenzhangbiaoti) {
		this.wenzhangbiaoti = wenzhangbiaoti;
	}
	
	/**
	 * 获取：文章标题
	 */
	public String getWenzhangbiaoti() {
		return wenzhangbiaoti;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：文件名称
	 */
	 
	public void setWenjianmingcheng(String wenjianmingcheng) {
		this.wenjianmingcheng = wenjianmingcheng;
	}
	
	/**
	 * 获取：文件名称
	 */
	public String getWenjianmingcheng() {
		return wenjianmingcheng;
	}
				
	
	/**
	 * 设置：关键字
	 */
	 
	public void setGuanjianzi(String guanjianzi) {
		this.guanjianzi = guanjianzi;
	}
	
	/**
	 * 获取：关键字
	 */
	public String getGuanjianzi() {
		return guanjianzi;
	}
				
	
	/**
	 * 设置：文章概述
	 */
	 
	public void setWenzhanggaishu(String wenzhanggaishu) {
		this.wenzhanggaishu = wenzhanggaishu;
	}
	
	/**
	 * 获取：文章概述
	 */
	public String getWenzhanggaishu() {
		return wenzhanggaishu;
	}
				
	
	/**
	 * 设置：文章详情
	 */
	 
	public void setWenzhangxiangqing(String wenzhangxiangqing) {
		this.wenzhangxiangqing = wenzhangxiangqing;
	}
	
	/**
	 * 获取：文章详情
	 */
	public String getWenzhangxiangqing() {
		return wenzhangxiangqing;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
			
}
