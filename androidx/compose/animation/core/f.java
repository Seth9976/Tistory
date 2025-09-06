package androidx.compose.animation.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;
import t.t;

public final class f extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Object q;
    public final Object r;
    public final SeekableTransitionState s;
    public final Transition t;
    public final float u;

    public f(Object object0, Object object1, SeekableTransitionState seekableTransitionState0, Transition transition0, float f, Continuation continuation0) {
        this.q = object0;
        this.r = object1;
        this.s = seekableTransitionState0;
        this.t = transition0;
        this.u = f;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.q, this.r, this.s, this.t, this.u, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SeekableTransitionState seekableTransitionState0 = this.s;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                Object object2 = this.q;
                Object object3 = this.r;
                if(Intrinsics.areEqual(object2, object3)) {
                    seekableTransitionState0.n = null;
                    if(Intrinsics.areEqual(seekableTransitionState0.getCurrentState(), object2)) {
                        return Unit.INSTANCE;
                    }
                }
                else {
                    SeekableTransitionState.access$moveAnimationToInitialState(seekableTransitionState0);
                }
                boolean z = Intrinsics.areEqual(object2, object3);
                float f = this.u;
                if(!z) {
                    this.t.updateTarget$animation_core_release(object2);
                    this.t.setPlayTimeNanos(0L);
                    seekableTransitionState0.setTargetState$animation_core_release(object2);
                    this.t.resetAnimationFraction$animation_core_release(f);
                }
                SeekableTransitionState.access$setFraction(seekableTransitionState0, f);
                if(seekableTransitionState0.m.isNotEmpty()) {
                    BuildersKt.launch$default(coroutineScope0, null, null, new t(seekableTransitionState0, null), 3, null);
                }
                else {
                    seekableTransitionState0.l = 0x8000000000000000L;
                }
                this.o = 1;
                if(SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(seekableTransitionState0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        seekableTransitionState0.c();
        return Unit.INSTANCE;
    }
}

