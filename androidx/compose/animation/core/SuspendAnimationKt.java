package androidx.compose.animation.core;

import androidx.compose.material3.ti;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.platform.k1;
import j0.b2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import t.a0;
import t.b0;
import t.c0;
import t.d0;
import t.g;

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ar\u0010\r\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001A2\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006H\u0086@\u00A2\u0006\u0004\b\r\u0010\u000E\u001A`\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u000F26\u0010\f\u001A2\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006H\u0086@\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u0098\u0001\u0010\r\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001A\u00028\u00002\u0006\u0010\u0002\u001A\u00028\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00018\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006H\u0086@\u00A2\u0006\u0004\b\r\u0010\u0017\u001Ay\u0010\u001E\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0002\u001A\u00028\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001A\u001A\u00020\u00192%\b\u0002\u0010\f\u001A\u001F\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001C\u0012\u0004\u0012\u00020\u000B0\u001B\u00A2\u0006\u0002\b\u001DH\u0086@\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001Ao\u0010\u0010\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010\u001A\u001A\u00020\u00192%\b\u0002\u0010\f\u001A\u001F\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001C\u0012\u0004\u0012\u00020\u000B0\u001B\u00A2\u0006\u0002\b\u001DH\u0086@\u00A2\u0006\u0004\b\u0010\u0010!\u001Au\u0010\r\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\b\b\u0002\u0010%\u001A\u00020$2%\b\u0002\u0010\f\u001A\u001F\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001C\u0012\u0004\u0012\u00020\u000B0\u001B\u00A2\u0006\u0002\b\u001DH\u0080@\u00A2\u0006\u0004\b\r\u0010&\u001AC\u0010(\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001C2\u0012\u0010\'\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0000\u00A2\u0006\u0004\b(\u0010)\"\u0018\u0010-\u001A\u00020\u0000*\u00020*8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b+\u0010,\u00A8\u0006."}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "updateState", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "durationScale", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n54#3,7:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,7\n*E\n"})
public final class SuspendAnimationKt {
    // 去混淆评级： 低(20)
    public static final Object a(Animation animation0, Function1 function10, Continuation continuation0) {
        return animation0.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function10, continuation0) : MonotonicFrameClockKt.withFrameNanos(new ti(function10, 18), continuation0);
    }

    public static final Object access$callWithFrameNanos(Animation animation0, Function1 function10, Continuation continuation0) {
        return SuspendAnimationKt.a(animation0, function10, continuation0);
    }

    @Nullable
    public static final Object animate(float f, float f1, float f2, @NotNull AnimationSpec animationSpec0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Float float0 = Boxing.boxFloat(f);
        Float float1 = Boxing.boxFloat(f1);
        Float float2 = Boxing.boxFloat(f2);
        Object object0 = SuspendAnimationKt.animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), float0, float1, float2, animationSpec0, function20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object animate(@NotNull AnimationState animationState0, @NotNull Animation animation0, long v, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Animation animation2;
        Function1 function12;
        AnimationState animationState2;
        Function1 function11;
        ObjectRef ref$ObjectRef1;
        a0 a00;
        AnimationState animationState1 = animationState0;
        Animation animation1 = animation0;
        if(continuation0 instanceof a0) {
            a00 = (a0)continuation0;
            int v1 = a00.t;
            if((v1 & 0x80000000) == 0) {
                a00 = new a0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                a00.t = v1 ^ 0x80000000;
            }
        }
        else {
            a00 = new a0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = a00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object2 = animation1.getValueFromNanos(0L);
                AnimationVector animationVector0 = animation1.getVelocityVectorFromNanos(0L);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                if(v == 0x8000000000000000L) {
                    try {
                        c0 c00 = new c0(ref$ObjectRef0, object2, animation0, animationVector0, animationState0, SuspendAnimationKt.getDurationScale(a00.getContext()), function10);
                        a00.o = animationState1;
                        a00.p = animation1;
                        a00.q = function10;
                        a00.r = ref$ObjectRef0;
                        a00.t = 1;
                        if(SuspendAnimationKt.a(animation1, c00, a00) == object1) {
                            return object1;
                        }
                    }
                    catch(CancellationException cancellationException0) {
                        ref$ObjectRef1 = ref$ObjectRef0;
                        goto label_72;
                    }
                    function11 = function10;
                    animationState2 = animationState1;
                    ref$ObjectRef1 = ref$ObjectRef0;
                }
                else {
                    try {
                        AnimationScope animationScope0 = new AnimationScope(object2, animation0.getTypeConverter(), animationVector0, v, animation0.getTargetValue(), v, true, new b0(1, animationState1));
                        ref$ObjectRef1 = ref$ObjectRef0;
                        SuspendAnimationKt.b(animationScope0, v, SuspendAnimationKt.getDurationScale(a00.getContext()), animation0, animationState0, function10);
                        ref$ObjectRef0.element = animationScope0;
                        function11 = function10;
                        animationState2 = animationState1;
                        ref$ObjectRef1 = ref$ObjectRef0;
                    }
                    catch(CancellationException cancellationException0) {
                        goto label_72;
                    }
                }
                goto label_58;
            }
            case 1: {
                ref$ObjectRef1 = a00.r;
                function12 = a00.q;
                animation2 = a00.p;
                animationState2 = a00.o;
                goto label_55;
            }
            case 2: {
                ref$ObjectRef1 = a00.r;
                function12 = a00.q;
                animation2 = a00.p;
                animationState2 = a00.o;
                try {
                label_55:
                    ResultKt.throwOnFailure(object0);
                    function11 = function12;
                    animation1 = animation2;
                    do {
                    label_58:
                        Object object3 = ref$ObjectRef1.element;
                        Intrinsics.checkNotNull(object3);
                        if(!((AnimationScope)object3).isRunning()) {
                            return Unit.INSTANCE;
                        }
                        d0 d00 = new d0(ref$ObjectRef1, SuspendAnimationKt.getDurationScale(a00.getContext()), animation1, animationState2, function11);
                        a00.o = animationState2;
                        a00.p = animation1;
                        a00.q = function11;
                        a00.r = ref$ObjectRef1;
                        a00.t = 2;
                    }
                    while(SuspendAnimationKt.a(animation1, d00, a00) != object1);
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        animationState1 = animationState2;
    label_72:
        AnimationScope animationScope1 = (AnimationScope)ref$ObjectRef1.element;
        if(animationScope1 != null) {
            animationScope1.setRunning$animation_core_release(false);
        }
        AnimationScope animationScope2 = (AnimationScope)ref$ObjectRef1.element;
        if(animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState1.getLastFrameTimeNanos()) {
            animationState1.setRunning$animation_core_release(false);
        }
        throw cancellationException0;
    }

    @Nullable
    public static final Object animate(@NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1, @Nullable Object object2, @NotNull AnimationSpec animationSpec0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        AnimationVector animationVector0;
        if(object2 == null) {
            animationVector0 = AnimationVectorsKt.newInstance(((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0)));
        }
        else {
            animationVector0 = (AnimationVector)twoWayConverter0.getConvertToVector().invoke(object2);
            if(animationVector0 == null) {
                animationVector0 = AnimationVectorsKt.newInstance(((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0)));
            }
        }
        TargetBasedAnimation targetBasedAnimation0 = new TargetBasedAnimation(animationSpec0, twoWayConverter0, object0, object1, animationVector0);
        Object object3 = SuspendAnimationKt.animate$default(new AnimationState(twoWayConverter0, object0, animationVector0, 0L, 0L, false, 56, null), targetBasedAnimation0, 0L, new b2(23, function20, twoWayConverter0), continuation0, 2, null);
        return object3 == a.getCOROUTINE_SUSPENDED() ? object3 : Unit.INSTANCE;
    }

    public static Object animate$default(float f, float f1, float f2, AnimationSpec animationSpec0, Function2 function20, Continuation continuation0, int v, Object object0) {
        if((v & 8) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return SuspendAnimationKt.animate(f, f1, ((v & 4) == 0 ? f2 : 0.0f), animationSpec0, function20, continuation0);
    }

    public static Object animate$default(AnimationState animationState0, Animation animation0, long v, Function1 function10, Continuation continuation0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x8000000000000000L;
        }
        if((v1 & 4) != 0) {
            function10 = g.z;
        }
        return SuspendAnimationKt.animate(animationState0, animation0, v, function10, continuation0);
    }

    public static Object animate$default(TwoWayConverter twoWayConverter0, Object object0, Object object1, Object object2, AnimationSpec animationSpec0, Function2 function20, Continuation continuation0, int v, Object object3) {
        Object object4 = (v & 8) == 0 ? object2 : null;
        return (v & 16) == 0 ? SuspendAnimationKt.animate(twoWayConverter0, object0, object1, object4, animationSpec0, function20, continuation0) : SuspendAnimationKt.animate(twoWayConverter0, object0, object1, object4, AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), function20, continuation0);
    }

    @Nullable
    public static final Object animateDecay(float f, float f1, @NotNull FloatDecayAnimationSpec floatDecayAnimationSpec0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        DecayAnimation decayAnimation0 = AnimationKt.DecayAnimation(floatDecayAnimationSpec0, f, f1);
        Object object0 = SuspendAnimationKt.animate$default(AnimationStateKt.AnimationState$default(f, f1, 0L, 0L, false, 28, null), decayAnimation0, 0L, new k1(function20, 4), continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object animateDecay(@NotNull AnimationState animationState0, @NotNull DecayAnimationSpec decayAnimationSpec0, boolean z, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Object object0 = SuspendAnimationKt.animate(animationState0, new DecayAnimation(decayAnimationSpec0, animationState0.getTypeConverter(), animationState0.getValue(), animationState0.getVelocityVector()), (z ? animationState0.getLastFrameTimeNanos() : 0x8000000000000000L), function10, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateDecay$default(AnimationState animationState0, DecayAnimationSpec decayAnimationSpec0, boolean z, Function1 function10, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            function10 = g.A;
        }
        return SuspendAnimationKt.animateDecay(animationState0, decayAnimationSpec0, z, function10, continuation0);
    }

    @Nullable
    public static final Object animateTo(@NotNull AnimationState animationState0, Object object0, @NotNull AnimationSpec animationSpec0, boolean z, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Object object1 = SuspendAnimationKt.animate(animationState0, new TargetBasedAnimation(animationSpec0, animationState0.getTypeConverter(), animationState0.getValue(), object0, animationState0.getVelocityVector()), (z ? animationState0.getLastFrameTimeNanos() : 0x8000000000000000L), function10, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object animateTo$default(AnimationState animationState0, Object object0, AnimationSpec animationSpec0, boolean z, Function1 function10, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            function10 = g.B;
        }
        return SuspendAnimationKt.animateTo(animationState0, object0, animationSpec0, z, function10, continuation0);
    }

    public static final void b(AnimationScope animationScope0, long v, float f, Animation animation0, AnimationState animationState0, Function1 function10) {
        long v1 = f == 0.0f ? animation0.getDurationNanos() : ((long)(((float)(v - animationScope0.getStartTimeNanos())) / f));
        animationScope0.setLastFrameTimeNanos$animation_core_release(v);
        animationScope0.setValue$animation_core_release(animation0.getValueFromNanos(v1));
        animationScope0.setVelocityVector$animation_core_release(animation0.getVelocityVectorFromNanos(v1));
        if(animation0.isFinishedFromNanos(v1)) {
            animationScope0.setFinishedTimeNanos$animation_core_release(animationScope0.getLastFrameTimeNanos());
            animationScope0.setRunning$animation_core_release(false);
        }
        SuspendAnimationKt.updateState(animationScope0, animationState0);
        function10.invoke(animationScope0);
    }

    public static final float getDurationScale(@NotNull CoroutineContext coroutineContext0) {
        MotionDurationScale motionDurationScale0 = (MotionDurationScale)coroutineContext0.get(MotionDurationScale.Key);
        float f = motionDurationScale0 == null ? 1.0f : motionDurationScale0.getScaleFactor();
        if(f < 0.0f) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return f;
    }

    public static final void updateState(@NotNull AnimationScope animationScope0, @NotNull AnimationState animationState0) {
        animationState0.setValue$animation_core_release(animationScope0.getValue());
        AnimationVectorsKt.copyFrom(animationState0.getVelocityVector(), animationScope0.getVelocityVector());
        animationState0.setFinishedTimeNanos$animation_core_release(animationScope0.getFinishedTimeNanos());
        animationState0.setLastFrameTimeNanos$animation_core_release(animationScope0.getLastFrameTimeNanos());
        animationState0.setRunning$animation_core_release(animationScope0.isRunning());
    }
}

