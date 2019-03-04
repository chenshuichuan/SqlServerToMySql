package com.ricardo.domain.mysqldata.pipe.pipCutting.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.pipCutting.PipCutting;
import com.ricardo.domain.mysqldata.pipe.pipCutting.mapper.PipCuttingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 下料 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class PipCuttingServiceImpl implements IPipCuttingService 
{
	@Autowired
	private PipCuttingRepository pipCuttingRepository;

	/**
     * 查询下料信息
     * 
     * @param oldId 下料ID
     * @return 下料信息
     */
    @Override
	public PipCutting selectPipCuttingById(Integer oldId)
	{
	    return pipCuttingRepository.findOne(oldId);
	}
	
	/**
     * 查询下料列表
     * 
     * @param pipCutting 下料信息
     * @return 下料集合
     */
	@Override
	public List<PipCutting> selectPipCuttingList(PipCutting pipCutting)
	{
	    return pipCuttingRepository.findAll();
	}
	
    /**
     * 新增下料
     * 
     * @param pipCutting 下料信息
     * @return 结果
     */
	@Override
	public int insertPipCutting(PipCutting pipCutting)
	{
		if(pipCuttingRepository.findOne(pipCutting.getOldId())==null){
			return pipCuttingRepository.save(pipCutting).getOldId();
		}
		return 0;
	}
	
	/**
     * 修改下料
     * 
     * @param pipCutting 下料信息
     * @return 结果
     */
	@Override
	public int updatePipCutting(PipCutting pipCutting)
	{
		if(pipCuttingRepository.findOne(pipCutting.getOldId())!=null){
			return pipCuttingRepository.save(pipCutting).getOldId();
		}
		return 0;
	}


	
}
