package com.ricardo.domain.mysqldata.pipe.ship.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.ship.Ship;
import com.ricardo.domain.mysqldata.pipe.ship.mapper.ShipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 号船 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class ShipServiceImpl implements IShipService 
{
	@Autowired
	private ShipRepository shipRepository;

	/**
     * 查询号船信息
     * 
     * @param id 号船ID
     * @return 号船信息
     */
    @Override
	public Ship selectShipById(Integer id)
	{
	    return shipRepository.findOne(id);
	}
	
	/**
     * 查询号船列表
     * 
     * @param ship 号船信息
     * @return 号船集合
     */
	@Override
	public List<Ship> selectShipList(Ship ship)
	{
	    return shipRepository.findAll();
	}
	
    /**
     * 新增号船
     * 
     * @param ship 号船信息
     * @return 结果
     */
	@Override
	public int insertShip(Ship ship)
	{
		if(shipRepository.findOne(ship.getId())==null){
			return shipRepository.save(ship).getId();
		}
		return 0;
	}
	
	/**
     * 修改号船
     * 
     * @param ship 号船信息
     * @return 结果
     */
	@Override
	public int updateShip(Ship ship)
	{
		if(shipRepository.findOne(ship.getId())!=null){
			return shipRepository.save(ship).getId();
		}
		return 0;
	}

}
