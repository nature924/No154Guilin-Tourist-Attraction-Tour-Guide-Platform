package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 线路推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
@TableName("xianlutuijian")
public class XianlutuijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XianlutuijianEntity() {
		
	}
	
	public XianlutuijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 线路编号
	 */
					
	private String xianlubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：线路编号
	 */
	public void setXianlubianhao(String xianlubianhao) {
		this.xianlubianhao = xianlubianhao;
	}
	/**
	 * 获取：线路编号
	 */
	public String getXianlubianhao() {
		return xianlubianhao;
	}
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
