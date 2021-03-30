package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Ctdnew;
import cn.edu.zju.gislab.SZTDService.po.CtdnewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtdnewMapper {
    int countByExample(CtdnewExample example);

    int deleteByExample(CtdnewExample example);

    int deleteByPrimaryKey(Integer ctdid);

    int insert(Ctdnew record);

    int insertSelective(Ctdnew record);

    List<Ctdnew> selectByExample(CtdnewExample example);

    Ctdnew selectByPrimaryKey(Integer ctdid);

    int updateByExampleSelective(@Param("record") Ctdnew record, @Param("example") CtdnewExample example);

    int updateByExample(@Param("record") Ctdnew record, @Param("example") CtdnewExample example);

    int updateByPrimaryKeySelective(Ctdnew record);

    int updateByPrimaryKey(Ctdnew record);
}