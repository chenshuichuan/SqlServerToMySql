package com.ricardo.domain.mysqldata.pipe.pipStore.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.pipStore.PipStore;
import com.ricardo.domain.mysqldata.pipe.pipStore.mapper.PipStoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管子存放 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class PipStoreServiceImpl implements IPipStoreService 
{
	@Autowired
	private PipStoreRepository pipStoreRepository;

	/**
     * 查询管子存放信息
     * 
     * @param oldId 管子存放ID
     * @return 管子存放信息
     */
    @Override
	public PipStore selectPipStoreById(Integer oldId)
	{
	    return pipStoreRepository.findOne(oldId);
	}
	
	/**
     * 查询管子存放列表
     * 
     * @param pipStore 管子存放信息
     * @return 管子存放集合
     */
	@Override
	public List<PipStore> selectPipStoreList(PipStore pipStore)
	{
	    return pipStoreRepository.findAll();
	}
	
    /**
     * 新增管子存放
     * 
     * @param pipStore 管子存放信息
     * @return 结果
     */
	@Override
	public int insertPipStore(PipStore pipStore)
	{
		if(pipStoreRepository.findOne(pipStore.getOldId())==null){
			return pipStoreRepository.save(pipStore).getOldId();
		}
		return 0;
	}
	
	/**
     * 修改管子存放
     * 
     * @param pipStore 管子存放信息
     * @return 结果
     */
	@Override
	public int updatePipStore(PipStore pipStore)
	{
		if(pipStoreRepository.findOne(pipStore.getOldId())!=null){
			return pipStoreRepository.save(pipStore).getOldId();
		}
		return 0;
	}

}
