package u;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import qd.a;

public final class t2 extends SuspendLambda implements Function2 {
    public Mutex o;
    public Object p;
    public Object q;
    public MutatorMutex r;
    public int s;
    public Object t;
    public final MutatePriority u;
    public final MutatorMutex v;
    public final Function2 w;
    public final Object x;

    public t2(MutatePriority mutatePriority0, MutatorMutex mutatorMutex0, Function2 function20, Object object0, Continuation continuation0) {
        this.u = mutatePriority0;
        this.v = mutatorMutex0;
        this.w = function20;
        this.x = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t2(this.u, this.v, this.w, this.x, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable1;
        MutatorMutex mutatorMutex2;
        r2 r22;
        Object object4;
        Function2 function21;
        Mutex mutex1;
        r2 r21;
        Object object3;
        MutatorMutex mutatorMutex0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Element coroutineContext$Element0 = ((CoroutineScope)this.t).getCoroutineContext().get(Job.Key);
                Intrinsics.checkNotNull(coroutineContext$Element0);
                r2 r20 = new r2(this.u, ((Job)coroutineContext$Element0));
                mutatorMutex0 = this.v;
                MutatorMutex.access$tryMutateOrCancel(mutatorMutex0, r20);
                Mutex mutex0 = mutatorMutex0.b;
                this.t = r20;
                this.o = mutex0;
                Function2 function20 = this.w;
                this.p = function20;
                Object object2 = this.x;
                this.q = object2;
                this.r = mutatorMutex0;
                this.s = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                object3 = object2;
                r21 = r20;
                mutex1 = mutex0;
                function21 = function20;
                goto label_33;
            }
            case 1: {
                MutatorMutex mutatorMutex1 = this.r;
                object3 = this.q;
                function21 = (Function2)this.p;
                Mutex mutex2 = this.o;
                r21 = (r2)this.t;
                ResultKt.throwOnFailure(object0);
                mutatorMutex0 = mutatorMutex1;
                mutex1 = mutex2;
                try {
                label_33:
                    this.t = r21;
                    this.o = mutex1;
                    this.p = mutatorMutex0;
                    this.q = null;
                    this.r = null;
                    this.s = 2;
                    object4 = function21.invoke(object3, this);
                }
                catch(Throwable throwable0) {
                    r22 = r21;
                    mutatorMutex2 = mutatorMutex0;
                    throwable1 = throwable0;
                    goto label_58;
                }
                if(object4 == object1) {
                    return object1;
                }
                mutatorMutex2 = mutatorMutex0;
                object0 = object4;
                r22 = r21;
                goto label_62;
            }
            case 2: {
                mutatorMutex2 = (MutatorMutex)this.p;
                mutex1 = this.o;
                r22 = (r2)this.t;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_62;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_58:
                    AtomicReference atomicReference0 = mutatorMutex2.a;
                    while(true) {
                        if(atomicReference0.compareAndSet(r22, null) || atomicReference0.get() != r22) {
                            throw throwable1;
                        }
                    }
                label_62:
                    AtomicReference atomicReference1 = mutatorMutex2.a;
                    while(true) {
                        if(atomicReference1.compareAndSet(r22, null) || atomicReference1.get() != r22) {
                            goto label_68;
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
    label_68:
        mutex1.unlock(null);
        return object0;
    }
}

