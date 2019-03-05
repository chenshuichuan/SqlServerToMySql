package com.ricardo.domain.mysqldata.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 中间数据读取程序状态 pipe_middle_status
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_middle_status")
public class MiddleStatus extends BaseEntity
{

	/** id */
	@Id
	@GeneratedValue
    @Column(name = "id")
	private Integer id;
	/** 错误描述 */
    @Column(name = "infor")
	private String infor;
	/** 涉及表格 */
    @Column(name = "relate_table")
	private String relateTable;
	/** 涉及数据 */
	@Column(name = "relate_data")
	private String relateData;
	/** 更新时间 */
    @Column(name = "create_time")
	private Date createTime;
	/** 涉及表格 */
	@Column(name = "operate_type")
	private String operateType;
	/** 是否已读 */
    @Column(name = "is_read")
	private Integer isRead;

	public MiddleStatus(){

	}
	public MiddleStatus(String infor, String relateTable, String relateData,String operateType) {
		this.infor = infor;
		this.relateTable = relateTable;
		this.relateData = relateData;
		this.createTime = new Date();
		this.operateType = operateType;
		this.isRead = 0;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}

	public String getInfor() {
		return infor;
	}

	public void setInfor(String infor) {
		this.infor = infor;
	}

	public String getRelateTable() {
		return relateTable;
	}

	public void setRelateTable(String relateTable) {
		this.relateTable = relateTable;
	}

	public String getRelateData() {
		return relateData;
	}

	public void setRelateData(String relateData) {
		this.relateData = relateData;
	}

	@Override
	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public Integer getIsRead() {
		return isRead;
	}

	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
}
