package com.google.firebase.installations.time;

public class SystemClock implements Clock {
    public static SystemClock a;

    @Override  // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static SystemClock getInstance() {
        if(SystemClock.a == null) {
            SystemClock.a = new SystemClock();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        return SystemClock.a;
    }
}

