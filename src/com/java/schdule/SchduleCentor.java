package com.java.schdule;

import com.java.schdule.Task.CopyImageFileTask;
import com.java.schdule.Task.ImageDecodeTask;
import com.java.schdule.Task.RenderTask;
import com.java.schdule.Task.VideoCodingTask;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SchduleCentor {
    // 处理器个数
    private static final int coreNum = 4;

    // 任务个数
    private static final int taskNum = 4;

    // 每个任务在每个处理器上的执行时间（通过图片的大小或者分辨率预估得到）
    List<List<Float>> computTime;

    // 复制图片任务
    private CopyImageFileTask copyImageFileTask;

    // 图像解码任务
    private ImageDecodeTask imageDecodeTask;

    // 图像渲染任务
    private RenderTask renderTask;

    // 视频编码任务
    private VideoCodingTask videoCodingTask;

    /**
     * 声明工作线程池
     */
    private ThreadPoolExecutor workerPool;

    /**
     * 初始化各个任务和线程池, 这里的coreId由HEFT算法计算得到
     */
    public SchduleCentor() {
        // 预估计算时间
        computTime = new ArrayList<>();
        estimatedComputTime();

        // 任务对应处理器
        List<Integer> tastToCore = heftAlgorithm();
        copyImageFileTask = new CopyImageFileTask(tastToCore.get(0));
        imageDecodeTask = new ImageDecodeTask(tastToCore.get(1));
        renderTask = new RenderTask(tastToCore.get(2));
        videoCodingTask = new VideoCodingTask(tastToCore.get(3));

        // 初始化线程池
        workerPool =  new ThreadPoolExecutor(4, 8, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));

        // 开始执行任务
        startTask();
    }

    // 预估每个任务在每个核上的执行时间
    public void estimatedComputTime() {

        TODO 通过规定的预估方式去给computTime赋值;

    }

    // 通过HEFT算法计算每个任务需要在哪个处理器上执行，使得整个流程的执行时间最短
    public ArrayList<Integer> heftAlgorithm() {
        /**
         * HEFT算法计算
         */
        return new ArrayList<>();
    }

    // 各任务开始执行
    public void startTask() {
        workerPool.execute(copyImageFileTask);
        workerPool.execute(imageDecodeTask);
        workerPool.execute(renderTask);
        workerPool.execute(videoCodingTask);
    }

}
