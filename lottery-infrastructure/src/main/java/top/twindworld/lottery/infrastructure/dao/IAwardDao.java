package top.twindworld.lottery.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.twindworld.lottery.infrastructure.po.Award;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}
