package com.ricardo.domain.mysqldata.pipe.cutPlan.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.cutPlan.CutPlan;
import com.ricardo.domain.mysqldata.pipe.cutPlan.mapper.CutPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *   服务层实现
 * 
 * @author ricardo
 * @date 2019-03-02
 */
@Service
public class CutPlanServiceImpl implements ICutPlanService 
{
	@Autowired
	private CutPlanRepository cutPlanRepository;

	/**
     * 查询 信息
     * 
     * @param id  ID
     * @return  信息
     */
    @Override
	public CutPlan selectCutPlanById(Integer id)
	{
	    return cutPlanRepository.findOne(id);
	}
	
	/**
     * 查询 列表
     * 
     * @param cutPlan  信息
     * @return  集合
     */
	@Override
	public List<CutPlan> selectCutPlanList(CutPlan cutPlan)
	{
	    return cutPlanRepository.findAll();
	}
	
    /**
     * 新增 
     * 
     * @param cutPlan  信息
     * @return 结果
     */
	@Override
	public int insertCutPlan(CutPlan cutPlan)
	{
		if(cutPlanRepository.findOne(cutPlan.getId())==null){
			return cutPlanRepository.save(cutPlan).getId();
		}
		return 0;
	}
	
	/**
     * 修改 
     * 
     * @param cutPlan  信息
     * @return 结果
     */
	@Override
	public int updateCutPlan(CutPlan cutPlan)
	{
		if(cutPlanRepository.findOne(cutPlan.getId())!=null){
			return cutPlanRepository.save(cutPlan).getId();
		}
		return 0;
	}


}
