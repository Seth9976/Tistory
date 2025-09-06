package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;
import j7.d;

public class HeartBeatConsumerComponent {
    public static Component create() {
        return Component.intoSet(new d(13), HeartBeatConsumer.class);
    }
}

