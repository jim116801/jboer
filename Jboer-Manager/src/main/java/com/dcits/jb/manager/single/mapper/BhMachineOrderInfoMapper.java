package com.dcits.jb.manager.single.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dcits.jb.manager.single.model.BhMachineOrderInfo;
import com.dcits.jb.manager.single.model.BhMachineOrderInfoExample;

public interface BhMachineOrderInfoMapper {
    int countByExample(BhMachineOrderInfoExample example);

    int deleteByExample(BhMachineOrderInfoExample example);

    int deleteByPrimaryKey(String machineOrderId);

    int insert(BhMachineOrderInfo record);

    int insertSelective(BhMachineOrderInfo record);

    List<BhMachineOrderInfo> selectByExample(BhMachineOrderInfoExample example);

    BhMachineOrderInfo selectByPrimaryKey(String machineOrderId);

    int updateByExampleSelective(@Param("record") BhMachineOrderInfo record, @Param("example") BhMachineOrderInfoExample example);

    int updateByExample(@Param("record") BhMachineOrderInfo record, @Param("example") BhMachineOrderInfoExample example);

    int updateByPrimaryKeySelective(BhMachineOrderInfo record);

    int updateByPrimaryKey(BhMachineOrderInfo record);
}