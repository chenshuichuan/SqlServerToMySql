package com.ricardo.domain.mysqldata.pipe.pipPipe.mapper;


import com.ricardo.domain.mysqldata.pipe.pipPipe.domain.PipPipe;

import java.util.List;

/**
 * 中间数据库Pipe 数据层
 * 
 * @author ricardo
 * @date 2019-03-06
 */
public interface PipPipeMapper 
{
	/**
     * 查询中间数据库Pipe信息
     * 
     * @param id 中间数据库PipeID
     * @return 中间数据库Pipe信息
     */
	public PipPipe selectPipPipeById(Integer id);
	
	/**
     * 查询中间数据库Pipe列表
     * 
     * @param pipPipe 中间数据库Pipe信息
     * @return 中间数据库Pipe集合
     */
	public List<PipPipe> selectPipPipeList(PipPipe pipPipe);
	
	/**
     * 新增中间数据库Pipe
     * 
     * @param pipPipe 中间数据库Pipe信息
     * @return 结果
     */
	public int insertPipPipe(PipPipe pipPipe);
	
	/**
     * 修改中间数据库Pipe
     * 
     * @param pipPipe 中间数据库Pipe信息
     * @return 结果
     */
	public int updatePipPipe(PipPipe pipPipe);
	
	/**
     * 删除中间数据库Pipe
     * 
     * @param id 中间数据库PipeID
     * @return 结果
     */
	public int deletePipPipeById(Integer id);
	
	/**
     * 批量删除中间数据库Pipe
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePipPipeByIds(String[] ids);
	
}