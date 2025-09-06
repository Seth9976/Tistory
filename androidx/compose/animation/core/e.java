package androidx.compose.animation.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import qd.a;
import zd.c;

public final class e extends SuspendLambda implements Function2 {
    public Mutex o;
    public SeekableTransitionState p;
    public int q;
    public final SeekableTransitionState r;
    public final Object s;
    public final Transition t;
    public final FiniteAnimationSpec u;

    public e(FiniteAnimationSpec finiteAnimationSpec0, SeekableTransitionState seekableTransitionState0, Transition transition0, Object object0, Continuation continuation0) {
        this.r = seekableTransitionState0;
        this.s = object0;
        this.t = transition0;
        this.u = finiteAnimationSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.u, this.r, this.t, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Mutex mutex0;
        SeekableTransitionState seekableTransitionState1;
        long v3;
        AnimationVector1D animationVector1D3;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Object object2 = this.s;
        SeekableTransitionState seekableTransitionState0 = this.r;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object3 = seekableTransitionState0.getTargetState();
                if(!Intrinsics.areEqual(object2, object3)) {
                    SeekableTransitionState.access$moveAnimationToInitialState(seekableTransitionState0);
                    SeekableTransitionState.access$setFraction(seekableTransitionState0, 0.0f);
                    this.t.updateTarget$animation_core_release(object2);
                    this.t.setPlayTimeNanos(0L);
                    seekableTransitionState0.setCurrentState$animation_core_release(object3);
                    seekableTransitionState0.setTargetState$animation_core_release(object2);
                }
                Mutex mutex1 = seekableTransitionState0.getCompositionContinuationMutex$animation_core_release();
                this.o = mutex1;
                this.p = seekableTransitionState0;
                this.q = 1;
                if(mutex1.lock(null, this) == object1) {
                    return object1;
                }
                mutex0 = mutex1;
                seekableTransitionState1 = seekableTransitionState0;
            label_34:
                try {
                }
                finally {
                    mutex0.unlock(null);
                }
                if(!Intrinsics.areEqual(object2, seekableTransitionState1.getComposedTargetState$animation_core_release())) {
                    this.o = null;
                    this.p = null;
                    this.q = 2;
                    if(SeekableTransitionState.access$doOneFrame(seekableTransitionState0, this) == object1) {
                        return object1;
                    }
                label_44:
                    this.q = 3;
                    if(SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(seekableTransitionState0, this) == object1) {
                        return object1;
                    }
                }
            label_47:
                if(!Intrinsics.areEqual(seekableTransitionState0.getCurrentState(), object2)) {
                    if(seekableTransitionState0.getFraction() < 1.0f) {
                        SeekingAnimationState seekableTransitionState$SeekingAnimationState0 = seekableTransitionState0.n;
                        VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec0 = this.u == null ? null : this.u.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
                        if(seekableTransitionState$SeekingAnimationState0 == null || !Intrinsics.areEqual(vectorizedFiniteAnimationSpec0, seekableTransitionState$SeekingAnimationState0.getAnimationSpec())) {
                            VectorizedAnimationSpec vectorizedAnimationSpec0 = seekableTransitionState$SeekingAnimationState0 == null ? null : seekableTransitionState$SeekingAnimationState0.getAnimationSpec();
                            if(vectorizedAnimationSpec0 != null) {
                                long v1 = seekableTransitionState$SeekingAnimationState0.getProgressNanos();
                                AnimationVector1D animationVector1D0 = seekableTransitionState$SeekingAnimationState0.getStart();
                                SeekableTransitionState.r.getClass();
                                AnimationVector1D animationVector1D1 = SeekableTransitionState.t;
                                AnimationVector1D animationVector1D2 = seekableTransitionState$SeekingAnimationState0.getInitialVelocity();
                                if(animationVector1D2 == null) {
                                    SeekableTransitionState.r.getClass();
                                    animationVector1D2 = SeekableTransitionState.s;
                                }
                                animationVector1D3 = (AnimationVector1D)vectorizedAnimationSpec0.getVelocityFromNanos(v1, animationVector1D0, animationVector1D1, animationVector1D2);
                            }
                            else if(seekableTransitionState$SeekingAnimationState0 == null || seekableTransitionState$SeekingAnimationState0.getProgressNanos() == 0L) {
                                SeekableTransitionState.r.getClass();
                                animationVector1D3 = SeekableTransitionState.s;
                            }
                            else {
                                long v2 = seekableTransitionState$SeekingAnimationState0.getDurationNanos() == 0x8000000000000000L ? seekableTransitionState0.getTotalDurationNanos$animation_core_release() : seekableTransitionState$SeekingAnimationState0.getDurationNanos();
                                if(((float)v2) / 1000000000.0f <= 0.0f) {
                                    SeekableTransitionState.r.getClass();
                                    animationVector1D3 = SeekableTransitionState.s;
                                }
                                else {
                                    animationVector1D3 = new AnimationVector1D(1.0f / (((float)v2) / 1000000000.0f));
                                }
                            }
                            if(seekableTransitionState$SeekingAnimationState0 == null) {
                                seekableTransitionState$SeekingAnimationState0 = new SeekingAnimationState();
                            }
                            seekableTransitionState$SeekingAnimationState0.setAnimationSpec(vectorizedFiniteAnimationSpec0);
                            seekableTransitionState$SeekingAnimationState0.setComplete(false);
                            seekableTransitionState$SeekingAnimationState0.setValue(seekableTransitionState0.getFraction());
                            seekableTransitionState$SeekingAnimationState0.getStart().set$animation_core_release(0, seekableTransitionState0.getFraction());
                            seekableTransitionState$SeekingAnimationState0.setDurationNanos(seekableTransitionState0.getTotalDurationNanos$animation_core_release());
                            seekableTransitionState$SeekingAnimationState0.setProgressNanos(0L);
                            seekableTransitionState$SeekingAnimationState0.setInitialVelocity(animationVector1D3);
                            if(vectorizedFiniteAnimationSpec0 == null) {
                                v3 = c.roundToLong((1.0 - ((double)seekableTransitionState0.getFraction())) * ((double)seekableTransitionState0.getTotalDurationNanos$animation_core_release()));
                            }
                            else {
                                SeekableTransitionState.r.getClass();
                                v3 = vectorizedFiniteAnimationSpec0.getDurationNanos(seekableTransitionState$SeekingAnimationState0.getStart(), SeekableTransitionState.t, animationVector1D3);
                            }
                            seekableTransitionState$SeekingAnimationState0.setAnimationSpecDuration(v3);
                            seekableTransitionState0.n = seekableTransitionState$SeekingAnimationState0;
                        }
                    }
                    this.o = null;
                    this.p = null;
                    this.q = 4;
                    if(SeekableTransitionState.access$runAnimations(seekableTransitionState0, this) == object1) {
                        return object1;
                    }
                label_95:
                    seekableTransitionState0.setCurrentState$animation_core_release(object2);
                    this.q = 5;
                    if(SeekableTransitionState.access$waitForComposition(seekableTransitionState0, this) == object1) {
                        return object1;
                    }
                    SeekableTransitionState.access$setFraction(seekableTransitionState0, 0.0f);
                }
                break;
            }
            case 1: {
                seekableTransitionState1 = this.p;
                mutex0 = this.o;
                ResultKt.throwOnFailure(object0);
                goto label_34;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                goto label_44;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                goto label_47;
            }
            case 4: {
                ResultKt.throwOnFailure(object0);
                goto label_95;
            }
            case 5: {
                ResultKt.throwOnFailure(object0);
                SeekableTransitionState.access$setFraction(seekableTransitionState0, 0.0f);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

