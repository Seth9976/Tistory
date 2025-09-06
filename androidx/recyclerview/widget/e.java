package androidx.recyclerview.widget;

import java.util.List;

public final class e implements Runnable {
    public final List a;
    public final List b;
    public final int c;
    public final Runnable d;
    public final AsyncListDiffer e;

    public e(AsyncListDiffer asyncListDiffer0, List list0, List list1, int v, Runnable runnable0) {
        this.e = asyncListDiffer0;
        this.a = list0;
        this.b = list1;
        this.c = v;
        this.d = runnable0;
    }

    @Override
    public final void run() {
        d d0 = new d(this, DiffUtil.calculateDiff(new c(this)));
        this.e.c.execute(d0);
    }
}

