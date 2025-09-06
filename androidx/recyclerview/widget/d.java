package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.List;

public final class d implements Runnable {
    public final DiffResult a;
    public final e b;

    public d(e e0, DiffResult diffUtil$DiffResult0) {
        this.b = e0;
        this.a = diffUtil$DiffResult0;
    }

    @Override
    public final void run() {
        e e0 = this.b;
        AsyncListDiffer asyncListDiffer0 = e0.e;
        if(asyncListDiffer0.g == e0.c) {
            List list0 = asyncListDiffer0.f;
            asyncListDiffer0.e = e0.b;
            asyncListDiffer0.f = Collections.unmodifiableList(e0.b);
            this.a.dispatchUpdatesTo(asyncListDiffer0.a);
            asyncListDiffer0.a(list0, e0.d);
        }
    }
}

