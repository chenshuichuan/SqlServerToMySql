package com.ricardo.domain.mysqldata.pipe.workPipe.service;

import com.ricardo.domain.mysqldata.pipe.workPipe.WorkPipe;

import java.util.List;

/**
 * 管件 服务层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface IWorkPipeService 
{
	/**
     * 查询管件信息
     * 
     * @param id 管件ID
     * @return 管件信息
     */
	public WorkPipe selectWorkPipeById(Integer id);
	
	/**
     * 查询管件列表
     * 
     * @param workPipe 管件信息
     * @return 管件集合
     */
	public List<WorkPipe> selectWorkPipeList(WorkPipe workPipe);
	
	/**
     * 新增管件
     * 
     * @param workPipe 管件信息
     * @return 结果
     */
	public int insertWorkPipe(WorkPipe workPipe);
	
	/**
     * 修改管件
     * 
     * @param workPipe 管件信息
     * @return 结果
     */
	public int updateWorkPipe(WorkPipe workPipe);

	
}
