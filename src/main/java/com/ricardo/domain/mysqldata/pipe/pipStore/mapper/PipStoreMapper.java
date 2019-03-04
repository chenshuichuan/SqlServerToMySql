package com.ricardo.domain.mysqldata.pipe.pipStore.mapper;

import com.ricardo.domain.mysqldata.pipe.pipStore.PipStore;

import java.util.List;

/**
 * 管子存放 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface PipStoreMapper 
{
	/**
     * 查询管子存放信息
     * 
     * @param oldId 管子存放ID
     * @return 管子存放信息
     */
	public PipStore selectPipStoreById(Integer oldId);
	
	/**
     * 查询管子存放列表
     * 
     * @param pipStore 管子存放信息
     * @return 管子存放集合
     */
	public List<PipStore> selectPipStoreList(PipStore pipStore);
	
	/**
     * 新增管子存放
     * 
     * @param pipStore 管子存放信息
     * @return 结果
     */
	public int insertPipStore(PipStore pipStore);
	
	/**
     * 修改管子存放
     * 
     * @param pipStore 管子存放信息
     * @return 结果
     */
	public int updatePipStore(PipStore pipStore);
	
	/**
     * 删除管子存放
     * 
     * @param oldId 管子存放ID
     * @return 结果
     */
	public int deletePipStoreById(Integer oldId);

	
}