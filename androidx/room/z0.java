package androidx.room;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

public final class z0 extends Lambda implements Function0 {
    public final Job w;

    public z0(Job job0) {
        this.w = job0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DefaultImpls.cancel$default(this.w, null, 1, null);
        return Unit.INSTANCE;
    }
}

