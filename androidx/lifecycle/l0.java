package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import qd.a;

public final class l0 extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public ObjectRef p;
    public CoroutineScope q;
    public Function2 r;
    public int s;
    public final Lifecycle t;
    public final State u;
    public final CoroutineScope v;
    public final Function2 w;

    public l0(Lifecycle lifecycle0, State lifecycle$State0, CoroutineScope coroutineScope0, Function2 function20, Continuation continuation0) {
        this.t = lifecycle0;
        this.u = lifecycle$State0;
        this.v = coroutineScope0;
        this.w = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l0(this.t, this.u, this.v, this.w, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ObjectRef ref$ObjectRef3;
        ObjectRef ref$ObjectRef2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Lifecycle lifecycle0 = this.t;
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(lifecycle0.getCurrentState() == State.DESTROYED) {
                    return Unit.INSTANCE;
                }
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ObjectRef ref$ObjectRef1 = new ObjectRef();
                try {
                    this.o = ref$ObjectRef0;
                    this.p = ref$ObjectRef1;
                    this.q = this.v;
                    this.r = this.w;
                    this.s = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                    cancellableContinuationImpl0.initCancellability();
                    Event lifecycle$Event0 = Event.Companion.upTo(this.u);
                    Event lifecycle$Event1 = Event.Companion.downFrom(this.u);
                    Mutex mutex0 = MutexKt.Mutex$default(false, 1, null);
                    k0 k00 = new k0(lifecycle$Event0, ref$ObjectRef0, this.v, lifecycle$Event1, cancellableContinuationImpl0, mutex0, this.w);
                    ref$ObjectRef1.element = k00;
                    Intrinsics.checkNotNull(k00, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle0.addObserver(k00);
                    Object object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                }
                catch(Throwable throwable0) {
                    ref$ObjectRef2 = ref$ObjectRef0;
                    ref$ObjectRef3 = ref$ObjectRef1;
                    goto label_41;
                }
                if(object2 == object1) {
                    return object1;
                }
                ref$ObjectRef2 = ref$ObjectRef0;
                ref$ObjectRef3 = ref$ObjectRef1;
                break;
            }
            case 1: {
                try {
                    ref$ObjectRef3 = this.p;
                    ref$ObjectRef2 = this.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_41:
                Job job0 = (Job)ref$ObjectRef2.element;
                if(job0 != null) {
                    DefaultImpls.cancel$default(job0, null, 1, null);
                }
                LifecycleEventObserver lifecycleEventObserver0 = (LifecycleEventObserver)ref$ObjectRef3.element;
                if(lifecycleEventObserver0 != null) {
                    lifecycle0.removeObserver(lifecycleEventObserver0);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Job job1 = (Job)ref$ObjectRef2.element;
        if(job1 != null) {
            DefaultImpls.cancel$default(job1, null, 1, null);
        }
        LifecycleEventObserver lifecycleEventObserver1 = (LifecycleEventObserver)ref$ObjectRef3.element;
        if(lifecycleEventObserver1 != null) {
            lifecycle0.removeObserver(lifecycleEventObserver1);
        }
        return Unit.INSTANCE;
    }
}

