package com.ricardo.domain.mysqldata.pipe.pipMaterial.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.pipMaterial.PipMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管子材料 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class PipMaterialServiceImpl implements IPipMaterialService 
{
	@Autowired
	private PipMaterialRepository pipMaterialRepository;

	/**
     * 查询管子材料信息
     * 
     * @param oldId 管子材料ID
     * @return 管子材料信息
     */
    @Override
	public PipMaterial selectPipMaterialById(Integer oldId)
	{
	    return pipMaterialRepository.findOne(oldId);
	}
	
	/**
     * 查询管子材料列表
     * 
     * @param pipMaterial 管子材料信息
     * @return 管子材料集合
     */
	@Override
	public List<PipMaterial> selectPipMaterialList(PipMaterial pipMaterial)
	{
	    return pipMaterialRepository.findAll();
	}
	
    /**
     * 新增管子材料
     * 
     * @param pipMaterial 管子材料信息
     * @return 结果
     */
	@Override
	public int insertPipMaterial(PipMaterial pipMaterial)
	{
		if(pipMaterialRepository.findOne(pipMaterial.getOldId())==null){
			return pipMaterialRepository.save(pipMaterial).getOldId();
		}
		return 0;
	}
	
	/**
     * 修改管子材料
     * 
     * @param pipMaterial 管子材料信息
     * @return 结果
     */
	@Override
	public int updatePipMaterial(PipMaterial pipMaterial)
	{
		if(pipMaterialRepository.findOne(pipMaterial.getOldId())!=null){
			return pipMaterialRepository.save(pipMaterial).getOldId();
		}
		return 0;
	}

	
}
