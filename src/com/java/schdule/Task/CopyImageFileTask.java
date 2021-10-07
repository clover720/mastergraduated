package com.java.schdule.Task;

import com.java.schdule.ITask;
import com.java.schdule.TaskResult;

/**
 * 每个任务绑定特定的处理器
 */
public class CopyImageFileTask implements ITask, Runnable {
    private int coreId;

    public CopyImageFileTask(int _coreId) {
        coreId = _coreId;
    }

    @Override
    public TaskResult runImp(int coreId) {
        return null;
    }

    /**
     * 每个任务绑定特定的核
     */
    @Override
    public void run() {
        // 执行任务的具体业务逻辑，传入特定的处理器核，绑定
        runImp(1);
    }
}
