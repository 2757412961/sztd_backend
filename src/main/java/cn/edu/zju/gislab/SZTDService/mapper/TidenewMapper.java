package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Tidenew;
import cn.edu.zju.gislab.SZTDService.po.TidenewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TidenewMapper {
    int countByExample(TidenewExample example);

    int deleteByExample(TidenewExample example);

    int deleteByPrimaryKey(Integer tideid);

    int insert(Tidenew record);

    int insertSelective(Tidenew record);

    List<Tidenew> selectByExample(TidenewExample example);

    Tidenew selectByPrimaryKey(Integer tideid);

    int updateByExampleSelective(@Param("record") Tidenew record, @Param("example") TidenewExample example);

    int updateByExample(@Param("record") Tidenew record, @Param("example") TidenewExample example);

    int updateByPrimaryKeySelective(Tidenew record);

    int updateByPrimaryKey(Tidenew record);
}