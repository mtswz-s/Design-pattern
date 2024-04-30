package fsm.impl;

import fsm.base.BaseObject;
import fsm.enums.StatusEnum;

/**
 * @Author MTSWZ
 * @Date 2024/4/30 15:29
 * @Version 1.0
 * @Desc
 */
public class TestObject extends BaseObject {

    public TestObject(StatusEnum statusEnum) {
        super(statusEnum);
    }

    @Override
    public void run() {
        System.out.println("TestObject run");
        currentStatus.enter();
        currentStatus.function(this);
        currentStatus.exit();
    }
}
