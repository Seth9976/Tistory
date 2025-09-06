package com.google.firebase.messaging.threads;

import j7.d;

public class PoolableExecutors {
    public static volatile d a;

    static {
        PoolableExecutors.a = new d(14);
    }

    public static ExecutorFactory factory() {
        return PoolableExecutors.a;
    }
}

