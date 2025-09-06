package s4;

import androidx.paging.SingleRunner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import qd.a;

public final class h2 {
    public final SingleRunner a;
    public final boolean b;
    public final Mutex c;
    public Job d;
    public int e;

    public h2(SingleRunner singleRunner0, boolean z) {
        Intrinsics.checkNotNullParameter(singleRunner0, "singleRunner");
        super();
        this.a = singleRunner0;
        this.b = z;
        this.c = MutexKt.Mutex$default(false, 1, null);
    }

    public final Object a(Job job0, ContinuationImpl continuationImpl0) {
        h2 h20;
        Mutex mutex0;
        f2 f20;
        if(continuationImpl0 instanceof f2) {
            f20 = (f2)continuationImpl0;
            int v = f20.t;
            if((v & 0x80000000) == 0) {
                f20 = new f2(this, continuationImpl0);
            }
            else {
                f20.t = v ^ 0x80000000;
            }
        }
        else {
            f20 = new f2(this, continuationImpl0);
        }
        Object object0 = f20.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f20.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f20.o = this;
                f20.p = job0;
                mutex0 = this.c;
                f20.q = mutex0;
                f20.t = 1;
                if(mutex0.lock(null, f20) == object1) {
                    return object1;
                }
                h20 = this;
                break;
            }
            case 1: {
                Mutex mutex1 = f20.q;
                Job job1 = f20.p;
                h20 = f20.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                job0 = job1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(job0 == h20.d) {
            h20.d = null;
        }
        mutex0.unlock(null);
        return Unit.INSTANCE;
    }

    public final Object b(int v, Job job0, ContinuationImpl continuationImpl0) {
        Mutex mutex1;
        Job job1;
        h2 h20;
        g2 g20;
        if(continuationImpl0 instanceof g2) {
            g20 = (g2)continuationImpl0;
            int v1 = g20.u;
            if((v1 & 0x80000000) == 0) {
                g20 = new g2(this, continuationImpl0);
            }
            else {
                g20.u = v1 ^ 0x80000000;
            }
        }
        else {
            g20 = new g2(this, continuationImpl0);
        }
        Object object0 = g20.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(g20.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g20.o = this;
                g20.p = job0;
                Mutex mutex0 = this.c;
                g20.q = mutex0;
                g20.r = v;
                g20.u = 1;
                if(mutex0.lock(null, g20) == object1) {
                    return object1;
                }
                h20 = this;
                job1 = job0;
                mutex1 = mutex0;
                goto label_32;
            }
            case 1: {
                v = g20.r;
                mutex1 = g20.q;
                job1 = g20.p;
                h20 = g20.o;
                ResultKt.throwOnFailure(object0);
                try {
                label_32:
                    Job job2 = h20.d;
                    if(job2 == null || !job2.isActive() || (h20.e < v || h20.e == v && h20.b)) {
                        if(job2 != null) {
                            job2.cancel(new e2(h20.a));
                        }
                        if(job2 != null) {
                            g20.o = h20;
                            g20.p = job1;
                            g20.q = mutex1;
                            g20.r = v;
                            g20.u = 2;
                            if(job2.join(g20) == object1) {
                                return object1;
                            }
                        }
                        h20.d = job1;
                        h20.e = v;
                    }
                    else {
                        z = false;
                        break;
                    label_49:
                        v = g20.r;
                        mutex1 = g20.q;
                        Job job3 = g20.p;
                        h2 h21 = g20.o;
                        ResultKt.throwOnFailure(object0);
                        h21.d = job3;
                        h21.e = v;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    mutex1.unlock(null);
                    throw throwable0;
                }
            }
            case 2: {
                goto label_49;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex1.unlock(null);
        return Boxing.boxBoolean(z);
    }
}

