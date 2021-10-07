package com.java.schdule;

/**
 * 任务接口类
 */
public interface ITask {
    /**
     * 执行 task 的具体逻辑
     *
     * @return task 的返回结果
     */
    TaskResult runImp(int coreId);
}
