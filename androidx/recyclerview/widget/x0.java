package androidx.recyclerview.widget;

import a7.b;
import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class x0 implements BackgroundCallback {
    public final b a;
    public final Executor b;
    public final AtomicBoolean c;
    public final w0 d;
    public final BackgroundCallback e;

    public x0(BackgroundCallback threadUtil$BackgroundCallback0) {
        this.e = threadUtil$BackgroundCallback0;
        this.a = new b(3);
        this.b = AsyncTask.THREAD_POOL_EXECUTOR;
        this.c = new AtomicBoolean(false);
        this.d = new w0(this);
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void loadTile(int v, int v1) {
        y0 y00 = y0.a(3, v, v1, 0, 0, 0, null);
        this.a.n(y00);
        if(this.c.compareAndSet(false, true)) {
            this.b.execute(this.d);
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void recycleTile(TileList.Tile tileList$Tile0) {
        y0 y00 = y0.a(4, 0, 0, 0, 0, 0, tileList$Tile0);
        this.a.n(y00);
        if(this.c.compareAndSet(false, true)) {
            this.b.execute(this.d);
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void refresh(int v) {
        y0 y00 = y0.a(1, v, 0, 0, 0, 0, null);
        synchronized(this.a.c) {
            y00.a = (y0)this.a.b;
            this.a.b = y00;
        }
        if(this.c.compareAndSet(false, true)) {
            this.b.execute(this.d);
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void updateRange(int v, int v1, int v2, int v3, int v4) {
        y0 y00 = y0.a(2, v, v1, v2, v3, v4, null);
        synchronized(this.a.c) {
            y00.a = (y0)this.a.b;
            this.a.b = y00;
        }
        if(this.c.compareAndSet(false, true)) {
            this.b.execute(this.d);
        }
    }
}

