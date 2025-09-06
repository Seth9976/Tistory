package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.constraintlayout.compose.f;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u2.b;
import z.i4;
import z.j4;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000F\u001A\u00020\u000B2!\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00072\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\"\u0010\u0017\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valueDelta", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "F", "getValue", "()F", "setValue", "(F)V", "value", "z/i4", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class UpdatableAnimationState {
    public static final int $stable = 8;
    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    public final VectorizedAnimationSpec a;
    public long b;
    public AnimationVector1D c;
    public boolean d;
    public float e;
    public static final i4 f;
    public static final AnimationVector1D g;

    static {
        UpdatableAnimationState.f = new i4();  // 初始化器: Ljava/lang/Object;-><init>()V
        UpdatableAnimationState.g = new AnimationVector1D(0.0f);
    }

    public UpdatableAnimationState(@NotNull AnimationSpec animationSpec0) {
        this.a = animationSpec0.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
        this.b = 0x8000000000000000L;
        this.c = UpdatableAnimationState.g;
    }

    @Nullable
    public final Object animateToZero(@NotNull Function1 function10, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Function0 function03;
        UpdatableAnimationState updatableAnimationState2;
        Function0 function01;
        Function1 function11;
        j4 j41;
        UpdatableAnimationState updatableAnimationState0;
        float f1;
        j4 j40;
        if(continuation0 instanceof j4) {
            j40 = (j4)continuation0;
            int v = j40.u;
            if((v & 0x80000000) == 0) {
                j40 = new j4(this, continuation0);
            }
            else {
                j40.u = v ^ 0x80000000;
            }
        }
        else {
            j40 = new j4(this, continuation0);
        }
        Object object0 = j40.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AnimationVector1D animationVector1D0 = UpdatableAnimationState.g;
        switch(j40.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.d) {
                    throw new IllegalStateException("animateToZero called while previous animation is running");
                }
                MotionDurationScale motionDurationScale0 = (MotionDurationScale)j40.getContext().get(MotionDurationScale.Key);
                float f = motionDurationScale0 == null ? 1.0f : motionDurationScale0.getScaleFactor();
                this.d = true;
                f1 = f;
                updatableAnimationState0 = this;
                j41 = j40;
                function11 = function10;
                function01 = function00;
                goto label_42;
            }
            case 1: {
                float f2 = j40.r;
                Function0 function02 = j40.q;
                Function1 function12 = (Function1)j40.p;
                UpdatableAnimationState updatableAnimationState1 = j40.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    function11 = function12;
                    f1 = f2;
                    updatableAnimationState0 = updatableAnimationState1;
                    j41 = j40;
                    function01 = function02;
                }
                catch(Throwable throwable0) {
                    updatableAnimationState2 = updatableAnimationState1;
                    updatableAnimationState2.b = 0x8000000000000000L;
                    updatableAnimationState2.c = animationVector1D0;
                    updatableAnimationState2.d = false;
                    throw throwable0;
                }
                try {
                    while(true) {
                        function01.invoke();
                        if(f1 == 0.0f) {
                            break;
                        }
                    label_42:
                        if(Math.abs(updatableAnimationState0.e) < 0.01f) {
                            break;
                        }
                        f f3 = new f(updatableAnimationState0, f1, function11);
                        j41.o = updatableAnimationState0;
                        j41.p = function11;
                        j41.q = function01;
                        j41.r = f1;
                        j41.u = 1;
                        if(MonotonicFrameClockKt.withFrameNanos(f3, j41) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    updatableAnimationState2 = updatableAnimationState0;
                }
                catch(Throwable throwable0) {
                    updatableAnimationState2 = updatableAnimationState0;
                    updatableAnimationState2.b = 0x8000000000000000L;
                    updatableAnimationState2.c = animationVector1D0;
                    updatableAnimationState2.d = false;
                    throw throwable0;
                }
                try {
                    if(Math.abs(updatableAnimationState2.e) != 0.0f) {
                        b b0 = new b(13, updatableAnimationState2, function11);
                        j41.o = updatableAnimationState2;
                        j41.p = function01;
                        j41.q = null;
                        j41.u = 2;
                        if(MonotonicFrameClockKt.withFrameNanos(b0, j41) == object1) {
                            return object1;
                        }
                        function03 = function01;
                        goto label_69;
                    }
                    updatableAnimationState2.b = 0x8000000000000000L;
                    updatableAnimationState2.c = animationVector1D0;
                    updatableAnimationState2.d = false;
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    updatableAnimationState2.b = 0x8000000000000000L;
                    updatableAnimationState2.c = animationVector1D0;
                    updatableAnimationState2.d = false;
                    throw throwable0;
                }
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function03 = (Function0)j40.p;
        updatableAnimationState2 = j40.o;
        try {
            ResultKt.throwOnFailure(object0);
        label_69:
            function03.invoke();
            updatableAnimationState2.b = 0x8000000000000000L;
            updatableAnimationState2.c = animationVector1D0;
            updatableAnimationState2.d = false;
            return Unit.INSTANCE;
        }
        catch(Throwable throwable0) {
        }
        updatableAnimationState2.b = 0x8000000000000000L;
        updatableAnimationState2.c = animationVector1D0;
        updatableAnimationState2.d = false;
        throw throwable0;
    }

    public final float getValue() {
        return this.e;
    }

    public final void setValue(float f) {
        this.e = f;
    }
}

