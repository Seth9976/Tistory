package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import java.util.ArrayList;

public final class u implements Runnable {
    public final int a;
    public final ResourceCallback b;
    public final x c;

    public u(x x0, ResourceCallback resourceCallback0, int v) {
        this.a = v;
        this.c = x0;
        this.b = resourceCallback0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Object object0 = this.b.getLock();
            synchronized(object0) {
                x x0 = this.c;
                synchronized(x0) {
                    this.c.a.getClass();
                    v v2 = new v(this.b, Executors.directExecutor());
                    if(((ArrayList)this.c.a.b).contains(v2)) {
                        this.c.v.a();
                        this.c.getClass();
                        try {
                            this.b.onResourceReady(this.c.v, this.c.r, this.c.y);
                        }
                        catch(Throwable throwable0) {
                            throw new d(throwable0);
                        }
                        this.c.f(this.b);
                    }
                    this.c.b();
                }
            }
            return;
        }
        synchronized(this.b.getLock()) {
            synchronized(this.c) {
                this.c.a.getClass();
                v v5 = new v(this.b, Executors.directExecutor());
                if(((ArrayList)this.c.a.b).contains(v5)) {
                    this.c.getClass();
                    try {
                        this.b.onLoadFailed(this.c.t);
                    }
                    catch(Throwable throwable1) {
                        throw new d(throwable1);
                    }
                }
                this.c.b();
            }
        }
    }
}

