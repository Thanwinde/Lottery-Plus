package top.twindworld.lottery.infrastructure.dao;


import org.apache.ibatis.annotations.Mapper;
import top.twindworld.lottery.infrastructure.po.Activity;


@Mapper
public interface IActivityDao {

   void insert(Activity req);

   Activity queryActivityById(Long activityId);

}
