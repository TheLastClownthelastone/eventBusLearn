package com.pt.eventBus;

import org.greenrobot.eventbus.EventBus;

public class Demo1
{

    public static void main(String[] args)
    {
        EventBus bus = EventBus.getDefault();
        bus.register(new EventLister());

        bus.post(1);
        bus.post("3");
    }
}
