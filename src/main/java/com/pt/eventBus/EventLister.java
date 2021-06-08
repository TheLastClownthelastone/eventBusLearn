package com.pt.eventBus;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * 事件监听
 */
public class EventLister
{

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void listenInteger(Integer param){
        System.out.println("当前线程为："+Thread.currentThread().getName());
        System.out.println("EventListener#listenInteger ->" + param);
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void listenString(String param){
        System.out.println("当前线程为："+Thread.currentThread().getName());
        System.out.println("EventListener#listenString ->" + param);
    }

}
