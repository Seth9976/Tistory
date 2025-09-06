package androidx.datastore.core;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public DisposableHandle o;
    public int p;
    public Object q;
    public final File r;

    public n(File file0, Continuation continuation0) {
        this.r = file0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProducerScope producerScope1;
        DisposableHandle disposableHandle0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.q;
                m m0 = new m(this.r, producerScope0);
                File file0 = this.r.getParentFile();
                Intrinsics.checkNotNull(file0);
                disposableHandle0 = Companion.access$observe(MulticastFileObserver.Companion, file0, m0);
                this.q = producerScope0;
                this.o = disposableHandle0;
                this.p = 1;
                if(producerScope0.send(Unit.INSTANCE, this) == object1) {
                    return object1;
                }
                producerScope1 = producerScope0;
                break;
            }
            case 1: {
                disposableHandle0 = this.o;
                producerScope1 = (ProducerScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l l0 = new l(disposableHandle0);
        this.q = null;
        this.o = null;
        this.p = 2;
        return ProduceKt.awaitClose(producerScope1, l0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

