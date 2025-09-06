package t;

import androidx.compose.animation.core.MutatePriority;
import androidx.compose.animation.core.MutatorMutex;
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

public final class o extends SuspendLambda implements Function2 {
    public Mutex o;
    public Object p;
    public MutatorMutex q;
    public int r;
    public Object s;
    public final MutatePriority t;
    public final MutatorMutex u;
    public final Function1 v;

    public o(MutatePriority mutatePriority0, MutatorMutex mutatorMutex0, Function1 function10, Continuation continuation0) {
        this.t = mutatePriority0;
        this.u = mutatorMutex0;
        this.v = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable1;
        MutatorMutex mutatorMutex2;
        n n2;
        Object object2;
        Mutex mutex1;
        n n1;
        Function1 function11;
        Mutex mutex0;
        MutatorMutex mutatorMutex0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Element coroutineContext$Element0 = ((CoroutineScope)this.s).getCoroutineContext().get(Job.Key);
                Intrinsics.checkNotNull(coroutineContext$Element0);
                n n0 = new n(this.t, ((Job)coroutineContext$Element0));
                mutatorMutex0 = this.u;
                MutatorMutex.access$tryMutateOrCancel(mutatorMutex0, n0);
                mutex0 = mutatorMutex0.b;
                this.s = n0;
                this.o = mutex0;
                Function1 function10 = this.v;
                this.p = function10;
                this.q = mutatorMutex0;
                this.r = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                function11 = function10;
                n1 = n0;
                mutex1 = mutex0;
                goto label_29;
            }
            case 1: {
                MutatorMutex mutatorMutex1 = this.q;
                function11 = (Function1)this.p;
                mutex0 = this.o;
                n1 = (n)this.s;
                ResultKt.throwOnFailure(object0);
                mutatorMutex0 = mutatorMutex1;
                mutex1 = mutex0;
                try {
                label_29:
                    this.s = n1;
                    this.o = mutex1;
                    this.p = mutatorMutex0;
                    this.q = null;
                    this.r = 2;
                    object2 = function11.invoke(this);
                }
                catch(Throwable throwable0) {
                    n2 = n1;
                    mutatorMutex2 = mutatorMutex0;
                    throwable1 = throwable0;
                    goto label_53;
                }
                if(object2 == object1) {
                    return object1;
                }
                mutatorMutex2 = mutatorMutex0;
                object0 = object2;
                n2 = n1;
                goto label_57;
            }
            case 2: {
                mutatorMutex2 = (MutatorMutex)this.p;
                mutex1 = this.o;
                n2 = (n)this.s;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_57;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_53:
                    AtomicReference atomicReference0 = mutatorMutex2.a;
                    while(true) {
                        if(atomicReference0.compareAndSet(n2, null) || atomicReference0.get() != n2) {
                            throw throwable1;
                        }
                    }
                label_57:
                    AtomicReference atomicReference1 = mutatorMutex2.a;
                    while(true) {
                        if(atomicReference1.compareAndSet(n2, null) || atomicReference1.get() != n2) {
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

