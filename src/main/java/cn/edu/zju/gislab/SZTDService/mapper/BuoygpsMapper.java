package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Buoygps;
import cn.edu.zju.gislab.SZTDService.po.BuoygpsExample;
import cn.edu.zju.gislab.SZTDService.po.BuoygpsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoygpsMapper {
    int countByExample(BuoygpsExample example);

    int deleteByExample(BuoygpsExample example);

    int deleteByPrimaryKey(BuoygpsKey key);

    int insert(Buoygps record);

    int insertSelective(Buoygps record);

    List<Buoygps> selectByExample(BuoygpsExample example);

    Buoygps selectByPrimaryKey(BuoygpsKey key);

    int updateByExampleSelective(@Param("record") Buoygps record, @Param("example") BuoygpsExample example);

    int updateByExample(@Param("record") Buoygps record, @Param("example") BuoygpsExample example);

    int updateByPrimaryKeySelective(Buoygps record);

    int updateByPrimaryKey(Buoygps record);
}