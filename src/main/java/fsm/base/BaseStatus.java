package fsm.base;

/**
 * @Author MTSWZ
 * @Date 2024/4/30 14:53
 * @Version 1.0
 * @Desc 状态基类 定义状态基本功能
 */
public abstract class BaseStatus {

    /**
     * 进入状态时调用
     */
    public abstract void enter();

    /**
     * 具体执行操作
     * @param object 状态机类对应挂载类
     */
    public abstract void function(BaseObject object);

    /**
     * 退出状态时调用
     */
    public abstract void exit();
}
