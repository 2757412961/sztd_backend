package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Fub;
import cn.edu.zju.gislab.SZTDService.po.FubExample;
import cn.edu.zju.gislab.SZTDService.po.FubKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FubMapper {
    int countByExample(FubExample example);

    int deleteByExample(FubExample example);

    int deleteByPrimaryKey(FubKey key);

    int insert(Fub record);

    int insertSelective(Fub record);

    List<Fub> selectByExample(FubExample example);

    Fub selectByPrimaryKey(FubKey key);

    int updateByExampleSelective(@Param("record") Fub record, @Param("example") FubExample example);

    int updateByExample(@Param("record") Fub record, @Param("example") FubExample example);

    int updateByPrimaryKeySelective(Fub record);

    int updateByPrimaryKey(Fub record);
}