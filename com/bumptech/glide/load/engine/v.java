package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;
import java.util.concurrent.Executor;

public final class v {
    public final ResourceCallback a;
    public final Executor b;

    public v(ResourceCallback resourceCallback0, Executor executor0) {
        this.a = resourceCallback0;
        this.b = executor0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof v ? this.a.equals(((v)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

