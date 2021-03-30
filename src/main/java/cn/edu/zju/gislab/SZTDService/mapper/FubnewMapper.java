package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Fubnew;
import cn.edu.zju.gislab.SZTDService.po.FubnewExample;
import cn.edu.zju.gislab.SZTDService.po.FubnewKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FubnewMapper {
    int countByExample(FubnewExample example);

    int deleteByExample(FubnewExample example);

    int deleteByPrimaryKey(FubnewKey key);

    int insert(Fubnew record);

    int insertSelective(Fubnew record);

    List<Fubnew> selectByExample(FubnewExample example);

    Fubnew selectByPrimaryKey(FubnewKey key);

    int updateByExampleSelective(@Param("record") Fubnew record, @Param("example") FubnewExample example);

    int updateByExample(@Param("record") Fubnew record, @Param("example") FubnewExample example);

    int updateByPrimaryKeySelective(Fubnew record);

    int updateByPrimaryKey(Fubnew record);
}