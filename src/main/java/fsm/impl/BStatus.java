package fsm.impl;

import fsm.base.BaseObject;
import fsm.base.BaseStatus;
import fsm.enums.StatusEnum;

import java.util.Random;

/**
 * @Author MTSWZ
 * @Date 2024/4/30 14:59
 * @Version 1.0
 * @Desc
 */
public class BStatus extends BaseStatus {
    @Override
    public void enter() {
        System.out.println("statusB 开始");
    }

    @Override
    public void function(BaseObject object) {
        System.out.println("statusB 执行");
        if (new Random().nextBoolean()) {
            object.switchStatus(StatusEnum.STATUS_A);
        }
    }

    @Override
    public void exit() {
        System.out.println("statusB 结束");
    }
}
