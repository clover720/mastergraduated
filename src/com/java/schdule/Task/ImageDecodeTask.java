package com.java.schdule.Task;

import com.java.schdule.ITask;
import com.java.schdule.TaskResult;

public class ImageDecodeTask implements ITask, Runnable{

    private int coreId;

    public ImageDecodeTask(int _coreId) {
        coreId = _coreId;
    }

    @Override
    public TaskResult runImp(int coreid) {
        return null;
    }

    @Override
    public void run() {
        // 传入特定的处理器核，绑定
        runImp(1);
    }
}
