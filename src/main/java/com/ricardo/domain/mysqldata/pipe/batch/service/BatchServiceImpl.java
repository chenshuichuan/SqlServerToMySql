package com.ricardo.domain.mysqldata.pipe.batch.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import com.ricardo.domain.mysqldata.pipe.batch.mapper.BatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * 加工批次 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class BatchServiceImpl implements IBatchService 
{
	@Autowired
	private BatchRepository batchRepository;

	/**
     * 查询加工批次信息
     * 
     * @param id 加工批次ID
     * @return 加工批次信息
     */
    @Override
	public Batch selectBatchById(Integer id)
	{
	    return batchRepository.findOne(id);
	}
	
	/**
     * 查询加工批次列表
     * 
     * @param batch 加工批次信息
     * @return 加工批次集合
     */
	@Override
	public List<Batch> selectBatchList(Batch batch)
	{
		return batchRepository.findAll();
	}
	
    /**
     * 新增加工批次
     * 
     * @param batch 加工批次信息
     * @return 插入后的id
     */
	@Override
	public int insertBatch(Batch batch)
	{

		if(batchRepository.findOne(batch.getId())==null){
			return batchRepository.save(batch).getId();
		}
		return 0;
	}
	
	/**
     * 修改加工批次
     * 
     * @param batch 加工批次信息
     * @return 更新后的id
     */
	@Override
	public int updateBatch(Batch batch)
	{
	    if(batchRepository.findOne(batch.getId())!=null){
	    	return batchRepository.save(batch).getId();
		}
		return 0;
	}

	
}
