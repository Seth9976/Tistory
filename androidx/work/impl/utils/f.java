package androidx.work.impl.utils;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Callable {
    public final IdGenerator a;
    public final int b;
    public final int c;

    public f(IdGenerator idGenerator0, int v, int v1) {
        this.a = idGenerator0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final Object call() {
        IdGenerator idGenerator0 = this.a;
        Intrinsics.checkNotNullParameter(idGenerator0, "this$0");
        int v = IdGeneratorKt.access$nextId(idGenerator0.a, "next_job_scheduler_id");
        int v1 = this.b;
        if(v1 > v || v > this.c) {
            IdGeneratorKt.access$updatePreference(idGenerator0.a, "next_job_scheduler_id", v1 + 1);
            v = v1;
        }
        return v;
    }
}

