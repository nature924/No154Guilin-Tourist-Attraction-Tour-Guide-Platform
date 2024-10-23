package com.entity.model;

import com.entity.XianlutuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 线路推荐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public class XianlutuijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 配图
	 */
	
	private String peitu;
		
	/**
	 * 出发地
	 */
	
	private String chufadi;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 预订数量
	 */
	
	private Integer yudingshuliang;
		
	/**
	 * 预订价格
	 */
	
	private Integer yudingjiage;
		
	/**
	 * 线路详情
	 */
	
	private String xianluxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：配图
	 */
	 
	public void setPeitu(String peitu) {
		this.peitu = peitu;
	}
	
	/**
	 * 获取：配图
	 */
	public String getPeitu() {
		return peitu;
	}
				
	
	/**
	 * 设置：出发地
	 */
	 
	public void setChufadi(String chufadi) {
		this.chufadi = chufadi;
	}
	
	/**
	 * 获取：出发地
	 */
	public String getChufadi() {
		return chufadi;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
				
	
	/**
	 * 设置：预订数量
	 */
	 
	public void setYudingshuliang(Integer yudingshuliang) {
		this.yudingshuliang = yudingshuliang;
	}
	
	/**
	 * 获取：预订数量
	 */
	public Integer getYudingshuliang() {
		return yudingshuliang;
	}
				
	
	/**
	 * 设置：预订价格
	 */
	 
	public void setYudingjiage(Integer yudingjiage) {
		this.yudingjiage = yudingjiage;
	}
	
	/**
	 * 获取：预订价格
	 */
	public Integer getYudingjiage() {
		return yudingjiage;
	}
				
	
	/**
	 * 设置：线路详情
	 */
	 
	public void setXianluxiangqing(String xianluxiangqing) {
		this.xianluxiangqing = xianluxiangqing;
	}
	
	/**
	 * 获取：线路详情
	 */
	public String getXianluxiangqing() {
		return xianluxiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
