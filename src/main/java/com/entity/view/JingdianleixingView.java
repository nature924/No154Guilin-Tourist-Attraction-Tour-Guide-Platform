package com.entity.view;

import com.entity.JingdianleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
@TableName("jingdianleixing")
public class JingdianleixingView  extends JingdianleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingdianleixingView(){
	}
 
 	public JingdianleixingView(JingdianleixingEntity jingdianleixingEntity){
 	try {
			BeanUtils.copyProperties(this, jingdianleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
