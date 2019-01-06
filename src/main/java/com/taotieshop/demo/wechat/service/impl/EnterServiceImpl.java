package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.EnterMapper;
import com.taotieshop.demo.entity.Enter;
import com.taotieshop.demo.entity.EnterExample;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.IFUtil;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.EnterService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 李宇
 * @Date: 2019/1/5 12:06
 * @Description:
 */
@Component
public class EnterServiceImpl implements EnterService {
    @Resource
    private EnterMapper enterMapper;
    @Override
    public Result addEnter(Enter enter) {
        EnterExample enterExample = new EnterExample();
        EnterExample.Criteria criteria = enterExample.createCriteria();
        criteria.andActivity_idEqualTo(enter.getActivity_id());
        criteria.andCreatorEqualTo(enter.getCreator());
        List<Enter> enters = enterMapper.selectByExample(enterExample);
        if(enters.size()>0){
            return ResultUtils.success("报名成功！");
        }
        enter.setEnter_status("待审核");
        enter.setCreate_time(IFUtil.CurrentDate());
        int intVal = enterMapper.insert(enter);
        if(intVal>0){
            return ResultUtils.success("报名成功！");
        }else {
            return ResultUtils.error(1,"报名失败！" );
        }
    }

    /**
     * 查询某个活动的所有报名信息
     * @return
     */
    @Override
    public Result getEnterList(int activityId) {
        EnterExample enterExample = new EnterExample();
        enterExample.setOrderByClause("create_time desc");

        EnterExample.Criteria criteria = enterExample.createCriteria();
        criteria.andActivity_idEqualTo(activityId);
        List<Enter> enterList = enterMapper.selectByExample(enterExample);
        return ResultUtils.success(enterList);
    }

    /**
     * 查询报名详细信息
     * @param enterId
     * @return
     */
    @Override
    public Result queryEnterInfo(int enterId) {
        EnterExample enterExample = new EnterExample();
        EnterExample.Criteria criteria = enterExample.createCriteria();
        criteria.andEnter_idEqualTo(enterId);
        List<Enter> enterList = enterMapper.selectByExample(enterExample);
        if (enterList.size()>0){
            return ResultUtils.success(enterList.get(0));
        }else{
            return ResultUtils.error(1, "数据错误！");
        }
    }

    /**
     * 审核报名信息
     * @param enter
     * @return
     */
    @Override
    public Result doAudit(Enter enter) {
        enter.setEnter_status("已审核");
        int intVal = enterMapper.updateStatusById(enter);
        if (intVal>0){
            return ResultUtils.success("审核通过");
        }else {
            return ResultUtils.error(1,"审核失败！");
        }
    }
}
