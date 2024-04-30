package fsm;

import fsm.enums.StatusEnum;
import fsm.impl.TestObject;

/**
 * @Author MTSWZ
 * @Date 2024/4/30 14:59
 * @Version 1.0
 * @Desc 有限状态机
 */
public class FsmMain {


    public static void main(String[] args) {
        TestObject testObject = new TestObject(StatusEnum.STATUS_A);
        testObject.run();
    }
}
