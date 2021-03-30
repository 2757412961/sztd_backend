package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Buoywvnew;
import cn.edu.zju.gislab.SZTDService.po.BuoywvnewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoywvnewMapper {
    int countByExample(BuoywvnewExample example);

    int deleteByExample(BuoywvnewExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Buoywvnew record);

    int insertSelective(Buoywvnew record);

    List<Buoywvnew> selectByExample(BuoywvnewExample example);

    Buoywvnew selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Buoywvnew record, @Param("example") BuoywvnewExample example);

    int updateByExample(@Param("record") Buoywvnew record, @Param("example") BuoywvnewExample example);

    int updateByPrimaryKeySelective(Buoywvnew record);

    int updateByPrimaryKey(Buoywvnew record);
}