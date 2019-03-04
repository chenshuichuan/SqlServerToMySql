package com.ricardo.domain.mysqldata.pipe.pipe.service;

import java.util.List;

import com.ricardo.domain.mysqldata.pipe.pipe.Pipe;
import com.ricardo.domain.mysqldata.pipe.pipe.mapper.PipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管件 服务层实现
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Service
public class PipeServiceImpl implements IPipeService 
{
	@Autowired
	private PipeRepository pipeRepository;

	/**
     * 查询管件信息
     * 
     * @param id 管件ID
     * @return 管件信息
     */
    @Override
	public Pipe selectPipeById(Integer id)
	{
	    return pipeRepository.findOne(id);
	}
	
	/**
     * 查询管件列表
     * 
     * @param pipe 管件信息
     * @return 管件集合
     */
	@Override
	public List<Pipe> selectPipeList(Pipe pipe)
	{
	    return pipeRepository.findAll();
	}
	
    /**
     * 新增管件
     * 
     * @param pipe 管件信息
     * @return 结果
     */
	@Override
	public int insertPipe(Pipe pipe)
	{
		if(pipeRepository.findOne(pipe.getId())==null){
			return pipeRepository.save(pipe).getId();
		}
		return 0;
	}
	
	/**
     * 修改管件
     * 
     * @param pipe 管件信息
     * @return 结果
     */
	@Override
	public int updatePipe(Pipe pipe)
	{
		if(pipeRepository.findOne(pipe.getId())!=null){
			return pipeRepository.save(pipe).getId();
		}
		return 0;
	}

}
