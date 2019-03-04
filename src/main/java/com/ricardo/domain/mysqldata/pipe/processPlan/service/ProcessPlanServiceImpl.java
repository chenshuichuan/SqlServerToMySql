package com.ricardo.domain.mysqldata.pipe.processPlan.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.processPlan.ProcessPlan;
import com.ricardo.domain.mysqldata.pipe.processPlan.mapper.ProcessPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *    服务层实现
 * 
 * @author ricardo
 * @date 2019-03-02
 */
@Service
public class ProcessPlanServiceImpl implements IProcessPlanService 
{
	@Autowired
	private ProcessPlanRepository processPlanRepository;

	/**
     * 查询  信息
     * 
     * @param id   ID
     * @return   信息
     */
    @Override
	public ProcessPlan selectProcessPlanById(Integer id)
	{
	    return processPlanRepository.findOne(id);
	}
	
	/**
     * 查询  列表
     * 
     * @param processPlan   信息
     * @return   集合
     */
	@Override
	public List<ProcessPlan> selectProcessPlanList(ProcessPlan processPlan)
	{
	    return processPlanRepository.findAll();
	}
	
    /**
     * 新增  
     * 
     * @param processPlan   信息
     * @return 结果
     */
	@Override
	public int insertProcessPlan(ProcessPlan processPlan)
	{
		if(processPlanRepository.findOne(processPlan.getId())==null){
			return processPlanRepository.save(processPlan).getId();
		}
		return 0;
	}
	
	/**
     * 修改  
     * 
     * @param processPlan   信息
     * @return 结果
     */
	@Override
	public int updateProcessPlan(ProcessPlan processPlan)
	{
		if(processPlanRepository.findOne(processPlan.getId())!=null){
			return processPlanRepository.save(processPlan).getId();
		}
		return 0;
	}

	
}
