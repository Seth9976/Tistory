package androidx.recyclerview.widget;

import a7.b;
import android.os.Handler;
import android.os.Looper;

public final class v0 implements MainThreadCallback {
    public final b a;
    public final Handler b;
    public final u0 c;
    public final MainThreadCallback d;

    public v0(MainThreadCallback threadUtil$MainThreadCallback0) {
        this.d = threadUtil$MainThreadCallback0;
        this.a = new b(3);
        this.b = new Handler(Looper.getMainLooper());
        this.c = new u0(this);
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void addTile(int v, TileList.Tile tileList$Tile0) {
        y0 y00 = y0.a(2, v, 0, 0, 0, 0, tileList$Tile0);
        this.a.n(y00);
        this.b.post(this.c);
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void removeTile(int v, int v1) {
        y0 y00 = y0.a(3, v, v1, 0, 0, 0, null);
        this.a.n(y00);
        this.b.post(this.c);
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void updateItemCount(int v, int v1) {
        y0 y00 = y0.a(1, v, v1, 0, 0, 0, null);
        this.a.n(y00);
        this.b.post(this.c);
    }
}

