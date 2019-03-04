package com.ricardo.domain.mysqldata.pipe.workPipe.mapper;

import com.ricardo.domain.mysqldata.pipe.workPipe.WorkPipe;
import java.util.List;	

/**
 * 管件 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface WorkPipeMapper 
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
	
	/**
     * 删除管件
     * 
     * @param id 管件ID
     * @return 结果
     */
	public int deleteWorkPipeById(Integer id);
	
	/**
     * 批量删除管件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteWorkPipeByIds(String[] ids);
	
}