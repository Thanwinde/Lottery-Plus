package top.twindworld.interfaces;


import org.apache.dubbo.config.annotation.Service;
import top.twindworld.common.Constants;
import top.twindworld.common.Result;
import top.twindworld.infrastructure.dao.IActivityDao;
import top.twindworld.infrastructure.po.Activity;
import top.twindworld.rpc.IActivityBooth;
import top.twindworld.rpc.dto.ActivityDto;
import top.twindworld.rpc.req.ActivityReq;
import top.twindworld.rpc.res.ActivityRes;

import javax.annotation.Resource;

/**

 * 活动展台
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

    @Override
    public String sayHello() {
        return "Hello!!!";
    }

}
