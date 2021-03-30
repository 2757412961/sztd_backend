package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Buoygpshistory;
import cn.edu.zju.gislab.SZTDService.po.BuoygpshistoryExample;
import cn.edu.zju.gislab.SZTDService.po.BuoygpshistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoygpshistoryMapper {
    int countByExample(BuoygpshistoryExample example);

    int deleteByExample(BuoygpshistoryExample example);

    int deleteByPrimaryKey(BuoygpshistoryKey key);

    int insert(Buoygpshistory record);

    int insertSelective(Buoygpshistory record);

    List<Buoygpshistory> selectByExample(BuoygpshistoryExample example);

    Buoygpshistory selectByPrimaryKey(BuoygpshistoryKey key);

    int updateByExampleSelective(@Param("record") Buoygpshistory record, @Param("example") BuoygpshistoryExample example);

    int updateByExample(@Param("record") Buoygpshistory record, @Param("example") BuoygpshistoryExample example);

    int updateByPrimaryKeySelective(Buoygpshistory record);

    int updateByPrimaryKey(Buoygpshistory record);
}