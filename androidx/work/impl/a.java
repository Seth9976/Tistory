package androidx.work.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class a implements Callable {
    public final Processor a;
    public final ArrayList b;
    public final String c;

    public a(Processor processor0, ArrayList arrayList0, String s) {
        this.a = processor0;
        this.b = arrayList0;
        this.c = s;
    }

    @Override
    public final Object call() {
        List list0 = this.a.e.workTagDao().getTagsForWorkSpecId(this.c);
        this.b.addAll(list0);
        return this.a.e.workSpecDao().getWorkSpec(this.c);
    }
}

