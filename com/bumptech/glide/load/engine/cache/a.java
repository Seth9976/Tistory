package com.bumptech.glide.load.engine.cache;

import java.util.concurrent.locks.ReentrantLock;

public final class a {
    public final ReentrantLock a;
    public int b;

    public a() {
        this.a = new ReentrantLock();
    }
}

