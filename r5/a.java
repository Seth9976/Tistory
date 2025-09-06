package r5;

import coil.disk.DiskLruCache;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;

public final class a extends SuspendLambda implements Function2 {
    public final DiskLruCache o;

    public a(DiskLruCache diskLruCache0, Continuation continuation0) {
        this.o = diskLruCache0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        DiskLruCache diskLruCache0 = this.o;
        synchronized(diskLruCache0) {
            if(diskLruCache0.n && !diskLruCache0.o) {
                try {
                    diskLruCache0.g();
                }
                catch(IOException unused_ex) {
                    diskLruCache0.p = true;
                }
                try {
                    if(DiskLruCache.access$journalRewriteRequired(diskLruCache0)) {
                        diskLruCache0.i();
                    }
                }
                catch(IOException unused_ex) {
                    diskLruCache0.q = true;
                    diskLruCache0.l = Okio.buffer(Okio.blackhole());
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }
}

