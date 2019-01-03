package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ActivityMapper;
import com.taotieshop.demo.entity.Activity;
import com.taotieshop.demo.entity.ActivityExample;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.IFUtil;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.ActivityService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2019/1/314:18
 * 类名: ActivityServiceImpl
 */
@Component
public class ActivityServiceImpl implements ActivityService {
    @Resource
    private ActivityMapper activityMapper;
    /**
     * 任务：
     * 描述：发布活动
     * 作者：李宇
     * 时间：2019/1/3 14:23
    */
    @Override
    public Result addActivity(Activity activity) {
        activity.setCreate_time(IFUtil.CurrentDate());
        activity.setActivity_status("待审核");
        int intVal = activityMapper.insert(activity);
        if(intVal>0){
            return ResultUtils.success("发布成功！");
        }else {
            return ResultUtils.error(1,"发布失败！" );
        }
    }

    /**
     * 任务：
     * 描述：获取活动列表
     * 作者：李宇
     * 时间：2019/1/3 14:29
    */
    @Override
    public Result getActivity() {
        ActivityExample activityExample = new ActivityExample();
        activityExample.setOrderByClause("create_time desc");
        List<Activity> activityList = activityMapper.selectByExample(activityExample);
        return ResultUtils.success(activityList);
    }

    /**
     * 任务：
     * 描述：通过id获取某一活动详细
     * 作者：李宇
     * 时间：2019/1/3 14:29
    */
    @Override
    public Result queryActivity(int activityId) {
        ActivityExample activityExample = new ActivityExample();
        ActivityExample.Criteria criteria = activityExample.createCriteria();
        criteria.andActivity_idEqualTo(activityId);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        if (activities.size()>0){
            return ResultUtils.success(activities.get(0));
        }else {
            return ResultUtils.error(1, "数据错误！");
        }
    }
}
