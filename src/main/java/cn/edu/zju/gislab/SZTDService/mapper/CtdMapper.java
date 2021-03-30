package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Ctd;
import cn.edu.zju.gislab.SZTDService.po.CtdExample;
import cn.edu.zju.gislab.SZTDService.po.CtdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtdMapper {
    int countByExample(CtdExample example);

    int deleteByExample(CtdExample example);

    int deleteByPrimaryKey(CtdKey key);

    int insert(Ctd record);

    int insertSelective(Ctd record);

    List<Ctd> selectByExample(CtdExample example);

    Ctd selectByPrimaryKey(CtdKey key);

    int updateByExampleSelective(@Param("record") Ctd record, @Param("example") CtdExample example);

    int updateByExample(@Param("record") Ctd record, @Param("example") CtdExample example);

    int updateByPrimaryKeySelective(Ctd record);

    int updateByPrimaryKey(Ctd record);
}