package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Buoygpsnew;
import cn.edu.zju.gislab.SZTDService.po.BuoygpsnewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoygpsnewMapper {
    int countByExample(BuoygpsnewExample example);

    int deleteByExample(BuoygpsnewExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Buoygpsnew record);

    int insertSelective(Buoygpsnew record);

    List<Buoygpsnew> selectByExample(BuoygpsnewExample example);

    Buoygpsnew selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Buoygpsnew record, @Param("example") BuoygpsnewExample example);

    int updateByExample(@Param("record") Buoygpsnew record, @Param("example") BuoygpsnewExample example);

    int updateByPrimaryKeySelective(Buoygpsnew record);

    int updateByPrimaryKey(Buoygpsnew record);
}