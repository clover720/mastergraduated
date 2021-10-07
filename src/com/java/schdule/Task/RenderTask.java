package com.java.schdule.Task;

import com.java.schdule.ITask;
import com.java.schdule.TaskResult;

public class RenderTask implements ITask, Runnable{

    private int coreId;

    public RenderTask(int _coreId) {
        coreId = _coreId;
    }

    @Override
    public TaskResult runImp(int coreId) {
        return null;
    }

    @Override
    public void run() {

    }
}
