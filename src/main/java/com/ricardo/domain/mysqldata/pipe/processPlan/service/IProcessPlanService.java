package com.ricardo.domain.mysqldata.pipe.processPlan.service;

import com.ricardo.domain.mysqldata.pipe.processPlan.ProcessPlan;

import java.util.List;

/**
 *    服务层
 * 
 * @author ricardo
 * @date 2019-03-02
 */
public interface IProcessPlanService 
{
	/**
     * 查询  信息
     * 
     * @param id   ID
     * @return   信息
     */
	public ProcessPlan selectProcessPlanById(Integer id);
	
	/**
     * 查询  列表
     * 
     * @param processPlan   信息
     * @return   集合
     */
	public List<ProcessPlan> selectProcessPlanList(ProcessPlan processPlan);
	
	/**
     * 新增  
     * 
     * @param processPlan   信息
     * @return 结果
     */
	public int insertProcessPlan(ProcessPlan processPlan);
	
	/**
     * 修改  
     * 
     * @param processPlan   信息
     * @return 结果
     */
	public int updateProcessPlan(ProcessPlan processPlan);
		

	
}
