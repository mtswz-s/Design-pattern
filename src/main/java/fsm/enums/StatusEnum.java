package fsm.enums;

import fsm.base.BaseStatus;
import fsm.impl.AStatus;
import fsm.impl.BStatus;

/**
 * @Author MTSWZ
 * @Date 2024/4/30 15:13
 * @Version 1.0
 * @Desc 状态枚举类 由于Java枚举不支持继承因此该类保存后续所有状态
 */
public enum StatusEnum {
    STATUS_A("A",new AStatus()),
    STATUS_B("B",new BStatus()),
    ;
    private final String name;

    private final BaseStatus status;

    StatusEnum(String name, BaseStatus status) {
        this.name = name;
        this.status = status;
    }

    public BaseStatus getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

}
