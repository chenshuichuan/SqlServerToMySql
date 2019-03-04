package com.ricardo.domain.mysqldata.pipe.pipe.mapper;

import com.ricardo.domain.mysqldata.pipe.pipe.Pipe;

import java.util.List;

/**
 * 管件 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface PipeMapper 
{
	/**
     * 查询管件信息
     * 
     * @param id 管件ID
     * @return 管件信息
     */
	public Pipe selectPipeById(Integer id);
	
	/**
     * 查询管件列表
     * 
     * @param pipe 管件信息
     * @return 管件集合
     */
	public List<Pipe> selectPipeList(Pipe pipe);
	
	/**
     * 新增管件
     * 
     * @param pipe 管件信息
     * @return 结果
     */
	public int insertPipe(Pipe pipe);
	
	/**
     * 修改管件
     * 
     * @param pipe 管件信息
     * @return 结果
     */
	public int updatePipe(Pipe pipe);
	
	/**
     * 删除管件
     * 
     * @param id 管件ID
     * @return 结果
     */
	public int deletePipeById(Integer id);

	
}