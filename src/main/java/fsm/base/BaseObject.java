package fsm.base;

import fsm.enums.StatusEnum;

/**
 * @Author MTSWZ
 * @Date 2024/4/30 15:05
 * @Version 1.0
 * @Desc 使用状态机的基类
 */
public abstract class BaseObject {

    /**
     *
     */
    protected BaseStatus currentStatus;

    public BaseObject(StatusEnum statusEnum) {
        this.currentStatus = statusEnum.getStatus();
    }

    /**
     * 状态切换
     * @param statusEnum 状态枚举
     */
    public void switchStatus(StatusEnum statusEnum) {
        BaseStatus newStatus = statusEnum.getStatus();
        this.currentStatus.exit();
        this.currentStatus = newStatus;
        newStatus.enter();
        newStatus.function(this);
    }

    /**
     * 主要执行逻辑（由子类实现）
     */
    public abstract void run();
}
