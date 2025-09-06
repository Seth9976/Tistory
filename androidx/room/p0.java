package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

public final class p0 extends Lambda implements Function1 {
    public final CancellationSignal w;
    public final Job x;

    public p0(CancellationSignal cancellationSignal0, Job job0) {
        this.w = cancellationSignal0;
        this.x = job0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        CancellationSignal cancellationSignal0 = this.w;
        if(cancellationSignal0 != null) {
            Api16Impl.cancel(cancellationSignal0);
        }
        DefaultImpls.cancel$default(this.x, null, 1, null);
        return Unit.INSTANCE;
    }
}

