package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import java.util.concurrent.Executor;

public final class b implements ExecutionListener {
    public final Executor a;
    public final List b;
    public final Configuration c;
    public final WorkDatabase d;

    public b(Executor executor0, List list0, Configuration configuration0, WorkDatabase workDatabase0) {
        this.a = executor0;
        this.b = list0;
        this.c = configuration0;
        this.d = workDatabase0;
    }

    @Override  // androidx.work.impl.ExecutionListener
    public final void onExecuted(WorkGenerationalId workGenerationalId0, boolean z) {
        c c0 = new c(0, this.b, workGenerationalId0, this.c, this.d);
        this.a.execute(c0);
    }
}

