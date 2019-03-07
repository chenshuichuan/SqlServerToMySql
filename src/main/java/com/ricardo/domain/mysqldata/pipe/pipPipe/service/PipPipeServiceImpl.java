package com.ricardo.domain.mysqldata.pipe.pipPipe.service;

import com.ricardo.domain.mysqldata.pipe.pipPipe.domain.PipPipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 中间数据库Pipe 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-06
 */
@Service
public class PipPipeServiceImpl implements IPipPipeService 
{
	@Autowired
	private PipPipeRepository pipPipeRepository;

	/**
     * 查询中间数据库Pipe信息
     * 
     * @param id 中间数据库PipeID
     * @return 中间数据库Pipe信息
     */
    @Override
	public PipPipe selectPipPipeById(Integer id)
	{
	    return pipPipeRepository.findOne(id);
	}
	
	/**
     * 查询中间数据库Pipe列表
     * 
     * @param pipPipe 中间数据库Pipe信息
     * @return 中间数据库Pipe集合
     */
	@Override
	public List<PipPipe> selectPipPipeList(PipPipe pipPipe)
	{
	    return pipPipeRepository.findAll();
	}
	
    /**
     * 新增中间数据库Pipe
     * 
     * @param pipPipe 中间数据库Pipe信息
     * @return 结果
     */
	@Override
	public int insertPipPipe(PipPipe pipPipe)
	{
		if(pipPipeRepository.findOne(pipPipe.getId())==null){
			return pipPipeRepository.save(pipPipe).getId();
		}
		return 0;

	}
	
	/**
     * 修改中间数据库Pipe
     * 
     * @param pipPipe 中间数据库Pipe信息
     * @return 结果
     */
	@Override
	public int updatePipPipe(PipPipe pipPipe)
	{

		if(pipPipeRepository.findOne(pipPipe.getId())!=null){
			return pipPipeRepository.save(pipPipe).getId();
		}
		return 0;
	}


	
}
