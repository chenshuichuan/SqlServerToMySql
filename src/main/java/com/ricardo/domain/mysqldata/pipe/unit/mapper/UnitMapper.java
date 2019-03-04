package com.ricardo.domain.mysqldata.pipe.unit.mapper;

import com.ricardo.domain.mysqldata.pipe.unit.Unit;

import java.util.List;

/**
 * 加工单元 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface UnitMapper 
{
	/**
     * 查询加工单元信息
     * 
     * @param id 加工单元ID
     * @return 加工单元信息
     */
	public Unit selectUnitById(Integer id);
	
	/**
     * 查询加工单元列表
     * 
     * @param unit 加工单元信息
     * @return 加工单元集合
     */
	public List<Unit> selectUnitList(Unit unit);
	
	/**
     * 新增加工单元
     * 
     * @param unit 加工单元信息
     * @return 结果
     */
	public int insertUnit(Unit unit);
	
	/**
     * 修改加工单元
     * 
     * @param unit 加工单元信息
     * @return 结果
     */
	public int updateUnit(Unit unit);
	
	/**
     * 删除加工单元
     * 
     * @param id 加工单元ID
     * @return 结果
     */
	public int deleteUnitById(Integer id);

	
}