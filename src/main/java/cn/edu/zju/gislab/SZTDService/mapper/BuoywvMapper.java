package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Buoywv;
import cn.edu.zju.gislab.SZTDService.po.BuoywvExample;
import cn.edu.zju.gislab.SZTDService.po.BuoywvKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoywvMapper {
    int countByExample(BuoywvExample example);

    int deleteByExample(BuoywvExample example);

    int deleteByPrimaryKey(BuoywvKey key);

    int insert(Buoywv record);

    int insertSelective(Buoywv record);

    List<Buoywv> selectByExample(BuoywvExample example);

    Buoywv selectByPrimaryKey(BuoywvKey key);

    int updateByExampleSelective(@Param("record") Buoywv record, @Param("example") BuoywvExample example);

    int updateByExample(@Param("record") Buoywv record, @Param("example") BuoywvExample example);

    int updateByPrimaryKeySelective(Buoywv record);

    int updateByPrimaryKey(Buoywv record);
}