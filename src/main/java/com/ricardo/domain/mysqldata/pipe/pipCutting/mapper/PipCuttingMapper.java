package com.ricardo.domain.mysqldata.pipe.pipCutting.mapper;

import com.ricardo.domain.mysqldata.pipe.pipCutting.PipCutting;

import java.util.List;

/**
 * 下料 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface PipCuttingMapper 
{
	/**
     * 查询下料信息
     * 
     * @param oldId 下料ID
     * @return 下料信息
     */
	public PipCutting selectPipCuttingById(Integer oldId);
	
	/**
     * 查询下料列表
     * 
     * @param pipCutting 下料信息
     * @return 下料集合
     */
	public List<PipCutting> selectPipCuttingList(PipCutting pipCutting);
	
	/**
     * 新增下料
     * 
     * @param pipCutting 下料信息
     * @return 结果
     */
	public int insertPipCutting(PipCutting pipCutting);
	
	/**
     * 修改下料
     * 
     * @param pipCutting 下料信息
     * @return 结果
     */
	public int updatePipCutting(PipCutting pipCutting);
	
	/**
     * 删除下料
     * 
     * @param oldId 下料ID
     * @return 结果
     */
	public int deletePipCuttingById(Integer oldId);

	
}