package top.twindworld.infrastructure.dao;


import org.apache.ibatis.annotations.Mapper;
import top.twindworld.infrastructure.po.Activity;


@Mapper
public interface IActivityDao {

   void insert(Activity req);

   Activity queryActivityById(Long activityId);

}
