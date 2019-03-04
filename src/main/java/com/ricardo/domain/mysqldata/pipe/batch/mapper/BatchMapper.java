package com.ricardo.domain.mysqldata.pipe.batch.mapper;

import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import java.util.List;	

/**
 * 加工批次 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface BatchMapper 
{
	/**
     * 查询加工批次信息
     * 
     * @param id 加工批次ID
     * @return 加工批次信息
     */
	public Batch selectBatchById(Integer id);
	
	/**
     * 查询加工批次列表
     * 
     * @param batch 加工批次信息
     * @return 加工批次集合
     */
	public List<Batch> selectBatchList(Batch batch);
	
	/**
     * 新增加工批次
     * 
     * @param batch 加工批次信息
     * @return 结果
     */
	public int insertBatch(Batch batch);
	
	/**
     * 修改加工批次
     * 
     * @param batch 加工批次信息
     * @return 结果
     */
	public int updateBatch(Batch batch);
	
	/**
     * 删除加工批次
     * 
     * @param id 加工批次ID
     * @return 结果
     */
	public int deleteBatchById(Integer id);
	
	/**
     * 批量删除加工批次
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBatchByIds(String[] ids);
	
}