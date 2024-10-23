package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxianlutuijianDao;
import com.entity.DiscussxianlutuijianEntity;
import com.service.DiscussxianlutuijianService;
import com.entity.vo.DiscussxianlutuijianVO;
import com.entity.view.DiscussxianlutuijianView;

@Service("discussxianlutuijianService")
public class DiscussxianlutuijianServiceImpl extends ServiceImpl<DiscussxianlutuijianDao, DiscussxianlutuijianEntity> implements DiscussxianlutuijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxianlutuijianEntity> page = this.selectPage(
                new Query<DiscussxianlutuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussxianlutuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxianlutuijianEntity> wrapper) {
		  Page<DiscussxianlutuijianView> page =new Query<DiscussxianlutuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxianlutuijianVO> selectListVO(Wrapper<DiscussxianlutuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxianlutuijianVO selectVO(Wrapper<DiscussxianlutuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxianlutuijianView> selectListView(Wrapper<DiscussxianlutuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxianlutuijianView selectView(Wrapper<DiscussxianlutuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
