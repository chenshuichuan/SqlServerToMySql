package com.ricardo.domain.mysqldata.pipe.pipManage.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.pipManage.PipManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 派工单 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class PipManageServiceImpl implements IPipManageService 
{
	@Autowired
	private PipManageRepository pipManageRepository;

	/**
     * 查询派工单信息
     * 
     * @param oldId 派工单ID
     * @return 派工单信息
     */
    @Override
	public PipManage selectPipManageById(Integer oldId)
	{
	    return pipManageRepository.findOne(oldId);
	}
	
	/**
     * 查询派工单列表
     * 
     * @param pipManage 派工单信息
     * @return 派工单集合
     */
	@Override
	public List<PipManage> selectPipManageList(PipManage pipManage)
	{
	    return pipManageRepository.findAll();
	}
	
    /**
     * 新增派工单
     * 
     * @param pipManage 派工单信息
     * @return 结果
     */
	@Override
	public int insertPipManage(PipManage pipManage)
	{
		if(pipManageRepository.findOne(pipManage.getOldId())==null){
			return pipManageRepository.save(pipManage).getOldId();
		}
		return 0;
	}
	
	/**
     * 修改派工单
     * 
     * @param pipManage 派工单信息
     * @return 结果
     */
	@Override
	public int updatePipManage(PipManage pipManage)
	{
		if(pipManageRepository.findOne(pipManage.getOldId())!=null){
			return pipManageRepository.save(pipManage).getOldId();
		}
		return 0;
	}

}
