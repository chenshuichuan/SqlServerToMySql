package com.ricardo.domain.mysqldata.pipe.unit.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.unit.Unit;
import com.ricardo.domain.mysqldata.pipe.unit.mapper.UnitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 加工单元 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class UnitServiceImpl implements IUnitService 
{
	@Autowired
	private UnitRepository unitRepository;

	/**
     * 查询加工单元信息
     * 
     * @param id 加工单元ID
     * @return 加工单元信息
     */
    @Override
	public Unit selectUnitById(Integer id)
	{
	    return unitRepository.findOne(id);
	}
	
	/**
     * 查询加工单元列表
     * 
     * @param unit 加工单元信息
     * @return 加工单元集合
     */
	@Override
	public List<Unit> selectUnitList(Unit unit)
	{
	    return unitRepository.findAll();
	}
	
    /**
     * 新增加工单元
     * 
     * @param unit 加工单元信息
     * @return 结果
     */
	@Override
	public int insertUnit(Unit unit)
	{
		if(unitRepository.findOne(unit.getId())==null){
			return unitRepository.save(unit).getId();
		}
		return 0;
	}
	
	/**
     * 修改加工单元
     * 
     * @param unit 加工单元信息
     * @return 结果
     */
	@Override
	public int updateUnit(Unit unit)
	{
		if(unitRepository.findOne(unit.getId())!=null){
			return unitRepository.save(unit).getId();
		}
		return 0;
	}

}
