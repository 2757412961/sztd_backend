package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Tide;
import cn.edu.zju.gislab.SZTDService.po.TideExample;
import cn.edu.zju.gislab.SZTDService.po.TideKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TideMapper {
    int countByExample(TideExample example);

    int deleteByExample(TideExample example);

    int deleteByPrimaryKey(TideKey key);

    int insert(Tide record);

    int insertSelective(Tide record);

    List<Tide> selectByExample(TideExample example);

    Tide selectByPrimaryKey(TideKey key);

    int updateByExampleSelective(@Param("record") Tide record, @Param("example") TideExample example);

    int updateByExample(@Param("record") Tide record, @Param("example") TideExample example);

    int updateByPrimaryKeySelective(Tide record);

    int updateByPrimaryKey(Tide record);
}