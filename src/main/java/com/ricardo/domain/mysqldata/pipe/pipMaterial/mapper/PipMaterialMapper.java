package com.ricardo.domain.mysqldata.pipe.pipMaterial.mapper;

import com.ricardo.domain.mysqldata.pipe.pipMaterial.PipMaterial;

import java.util.List;

/**
 * 管子材料 数据层
 * 
 * @author ricardo
 * @date 2019-03-04
 */
public interface PipMaterialMapper 
{
	/**
     * 查询管子材料信息
     * 
     * @param oldId 管子材料ID
     * @return 管子材料信息
     */
	public PipMaterial selectPipMaterialById(Integer oldId);
	
	/**
     * 查询管子材料列表
     * 
     * @param pipMaterial 管子材料信息
     * @return 管子材料集合
     */
	public List<PipMaterial> selectPipMaterialList(PipMaterial pipMaterial);
	
	/**
     * 新增管子材料
     * 
     * @param pipMaterial 管子材料信息
     * @return 结果
     */
	public int insertPipMaterial(PipMaterial pipMaterial);
	
	/**
     * 修改管子材料
     * 
     * @param pipMaterial 管子材料信息
     * @return 结果
     */
	public int updatePipMaterial(PipMaterial pipMaterial);
	
	/**
     * 删除管子材料
     * 
     * @param oldId 管子材料ID
     * @return 结果
     */
	public int deletePipMaterialById(Integer oldId);
	
	/**
     * 批量删除管子材料
     * 
     * @param oldIds 需要删除的数据ID
     * @return 结果
     */
	public int deletePipMaterialByIds(String[] oldIds);
	
}