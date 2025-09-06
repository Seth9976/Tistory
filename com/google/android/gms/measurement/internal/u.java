package com.google.android.gms.measurement.internal;

import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class u extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final zzfo d;

    public u(zzfo zzfo0, Runnable runnable0, boolean z, String s) {
        this.d = zzfo0;
        super(runnable0, null);
        Preconditions.checkNotNull(s);
        long v = zzfo.j.getAndIncrement();
        this.a = v;
        this.c = s;
        this.b = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            a.v(zzfo0.zzt, "Tasks index overflow");
        }
    }

    public u(zzfo zzfo0, Callable callable0, boolean z) {
        this.d = zzfo0;
        super(callable0);
        Preconditions.checkNotNull("Task exception on worker thread");
        long v = zzfo.j.getAndIncrement();
        this.a = v;
        this.c = "Task exception on worker thread";
        this.b = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            a.v(zzfo0.zzt, "Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(Object object0) {
        boolean z = this.b;
        if(z != ((u)object0).b) {
            return z ? -1 : 1;
        }
        long v = this.a;
        int v1 = Long.compare(v, ((u)object0).a);
        if(v1 >= 0) {
            if(v1 > 0) {
                return 1;
            }
            this.d.zzt.zzay().zzh().zzb("Two tasks share the same index. index", v);
            return 0;
        }
        return -1;
    }

    @Override
    public final void setException(Throwable throwable0) {
        this.d.zzt.zzay().zzd().zzb(this.c, throwable0);
        super.setException(throwable0);
    }
}

