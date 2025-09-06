package com.bumptech.glide.load.engine;

import androidx.appcompat.widget.a;
import c6.b;
import com.bumptech.glide.load.Key;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c {
    public final boolean a;
    public final ExecutorService b;
    public final HashMap c;
    public final ReferenceQueue d;
    public Engine e;
    public volatile boolean f;

    public c(boolean z) {
        ExecutorService executorService0 = Executors.newSingleThreadExecutor(new b(1));
        super();
        this.c = new HashMap();
        this.d = new ReferenceQueue();
        this.a = z;
        this.b = executorService0;
        executorService0.execute(new a(this, 7));
    }

    public final void a(Key key0, z z0) {
        synchronized(this) {
            com.bumptech.glide.load.engine.b b0 = new com.bumptech.glide.load.engine.b(key0, z0, this.d, this.a);
            com.bumptech.glide.load.engine.b b1 = (com.bumptech.glide.load.engine.b)this.c.put(key0, b0);
            if(b1 != null) {
                b1.c = null;
                b1.clear();
            }
        }
    }

    public final void b(com.bumptech.glide.load.engine.b b0) {
        synchronized(this) {
            this.c.remove(b0.a);
            if(b0.b) {
                Resource resource0 = b0.c;
                if(resource0 != null) {
                    z z0 = new z(resource0, true, false, b0.a, this.e);
                    this.e.onResourceReleased(b0.a, z0);
                }
            }
        }
    }
}

