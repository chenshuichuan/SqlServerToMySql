package com.ricardo.domain.mysqldata.pipe.workPipe.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.workPipe.WorkPipe;
import com.ricardo.domain.mysqldata.pipe.workPipe.mapper.WorkPipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管件 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class WorkPipeServiceImpl implements IWorkPipeService 
{
	@Autowired
	private WorkPipeRepository workPipeRepository;

	/**
     * 查询管件信息
     * 
     * @param id 管件ID
     * @return 管件信息
     */
    @Override
	public WorkPipe selectWorkPipeById(Integer id)
	{
	    return workPipeRepository.findOne(id);
	}
	
	/**
     * 查询管件列表
     * 
     * @param workPipe 管件信息
     * @return 管件集合
     */
	@Override
	public List<WorkPipe> selectWorkPipeList(WorkPipe workPipe)
	{
	    return workPipeRepository.findAll();
	}
	
    /**
     * 新增管件
     * 
     * @param workPipe 管件信息
     * @return 结果
     */
	@Override
	public int insertWorkPipe(WorkPipe workPipe)
	{
		if(workPipeRepository.findOne(workPipe.getId())==null){
			return workPipeRepository.save(workPipe).getId();
		}
		return 0;
	}
	
	/**
     * 修改管件
     * 
     * @param workPipe 管件信息
     * @return 结果
     */
	@Override
	public int updateWorkPipe(WorkPipe workPipe)
	{
		if(workPipeRepository.findOne(workPipe.getId())!=null){
			return workPipeRepository.save(workPipe).getId();
		}
		return 0;
	}


}
