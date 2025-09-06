package w0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.InternalMutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import qd.a;

public final class x0 extends SuspendLambda implements Function2 {
    public Mutex o;
    public Object p;
    public InternalMutatorMutex q;
    public int r;
    public Object s;
    public final MutatePriority t;
    public final InternalMutatorMutex u;
    public final Function1 v;

    public x0(MutatePriority mutatePriority0, InternalMutatorMutex internalMutatorMutex0, Function1 function10, Continuation continuation0) {
        this.t = mutatePriority0;
        this.u = internalMutatorMutex0;
        this.v = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new x0(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable1;
        InternalMutatorMutex internalMutatorMutex2;
        w0 w02;
        Object object2;
        Mutex mutex1;
        w0 w01;
        Function1 function11;
        Mutex mutex0;
        InternalMutatorMutex internalMutatorMutex0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Element coroutineContext$Element0 = ((CoroutineScope)this.s).getCoroutineContext().get(Job.Key);
                Intrinsics.checkNotNull(coroutineContext$Element0);
                w0 w00 = new w0(this.t, ((Job)coroutineContext$Element0));
                internalMutatorMutex0 = this.u;
                InternalMutatorMutex.access$tryMutateOrCancel(internalMutatorMutex0, w00);
                mutex0 = internalMutatorMutex0.b;
                this.s = w00;
                this.o = mutex0;
                Function1 function10 = this.v;
                this.p = function10;
                this.q = internalMutatorMutex0;
                this.r = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                function11 = function10;
                w01 = w00;
                mutex1 = mutex0;
                goto label_29;
            }
            case 1: {
                InternalMutatorMutex internalMutatorMutex1 = this.q;
                function11 = (Function1)this.p;
                mutex0 = this.o;
                w01 = (w0)this.s;
                ResultKt.throwOnFailure(object0);
                internalMutatorMutex0 = internalMutatorMutex1;
                mutex1 = mutex0;
                try {
                label_29:
                    this.s = w01;
                    this.o = mutex1;
                    this.p = internalMutatorMutex0;
                    this.q = null;
                    this.r = 2;
                    object2 = function11.invoke(this);
                }
                catch(Throwable throwable0) {
                    w02 = w01;
                    internalMutatorMutex2 = internalMutatorMutex0;
                    throwable1 = throwable0;
                    goto label_53;
                }
                if(object2 == object1) {
                    return object1;
                }
                internalMutatorMutex2 = internalMutatorMutex0;
                object0 = object2;
                w02 = w01;
                goto label_57;
            }
            case 2: {
                internalMutatorMutex2 = (InternalMutatorMutex)this.p;
                mutex1 = this.o;
                w02 = (w0)this.s;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_57;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_53:
                    AtomicReference atomicReference0 = internalMutatorMutex2.a;
                    while(true) {
                        if(atomicReference0.compareAndSet(w02, null) || atomicReference0.get() != w02) {
                            throw throwable1;
                        }
                    }
                label_57:
                    AtomicReference atomicReference1 = internalMutatorMutex2.a;
                    while(true) {
                        if(atomicReference1.compareAndSet(w02, null) || atomicReference1.get() != w02) {
                            goto label_63;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex1.unlock(null);
        throw throwable2;
    label_63:
        mutex1.unlock(null);
        return object0;
    }
}

