package top.twindworld.lottery.domain.award.service.goods.impl;

import org.springframework.stereotype.Component;
import top.twindworld.lottery.common.Constants;
import top.twindworld.lottery.domain.award.model.req.GoodsReq;
import top.twindworld.lottery.domain.award.model.res.DistributionRes;
import top.twindworld.lottery.domain.award.service.goods.DistributionBase;
import top.twindworld.lottery.domain.award.service.goods.IDistributionGoods;

/**
 * @description: 优惠券商品
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/4
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class CouponGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用优惠券发放接口
        logger.info("模拟调用优惠券发放接口 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.CouponGoods.getCode();
    }

}
