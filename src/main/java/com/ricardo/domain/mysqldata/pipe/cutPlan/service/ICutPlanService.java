package com.ricardo.domain.mysqldata.pipe.cutPlan.service;

import com.ricardo.domain.mysqldata.pipe.cutPlan.CutPlan;

import java.util.List;

/**
 *    服务层
 * 
 * @author ricardo
 * @date 2019-03-02
 */
public interface ICutPlanService 
{
	/**
     * 查询  信息
     * 
     * @param id   ID
     * @return   信息
     */
	public CutPlan selectCutPlanById(Integer id);
	
	/**
     * 查询  列表
     * 
     * @param cutPlan   信息
     * @return   集合
     */
	public List<CutPlan> selectCutPlanList(CutPlan cutPlan);
	
	/**
     * 新增  
     * 
     * @param cutPlan   信息
     * @return 结果
     */
	public int insertCutPlan(CutPlan cutPlan);
	
	/**
     * 修改  
     * 
     * @param cutPlan   信息
     * @return 结果
     */
	public int updateCutPlan(CutPlan cutPlan);

	
}
