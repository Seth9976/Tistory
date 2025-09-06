package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import t.b;
import t.d;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u000B\u0010\rJ%\u0010\u0011\u001A\u00020\u00102\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012Jg\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A2\u0006\u0010\u0013\u001A\u00028\u00002\u000E\b\u0002\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0016\u001A\u00028\u00002\'\b\u0002\u0010\u0019\u001A!\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017\u00A2\u0006\u0002\b\u0018H\u0086@\u00A2\u0006\u0004\b\u001B\u0010\u001CJ[\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A2\u0006\u0010\u0016\u001A\u00028\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D2\'\b\u0002\u0010\u0019\u001A!\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017\u00A2\u0006\u0002\b\u0018H\u0086@\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0018\u0010 \u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00028\u0000H\u0086@\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0010H\u0086@\u00A2\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000$\u00A2\u0006\u0004\b%\u0010&R#\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R&\u00104\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R+\u00109\u001A\u0002052\u0006\u00106\u001A\u0002058F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\u0013\u001A\u00028\u00002\u0006\u00106\u001A\u00028\u00008F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b=\u00108\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010\u000E\u001A\u0004\u0018\u00018\u00002\b\u00106\u001A\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010?R(\u0010\u000F\u001A\u0004\u0018\u00018\u00002\b\u00106\u001A\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bE\u0010C\u001A\u0004\bF\u0010?R \u0010L\u001A\b\u0012\u0004\u0012\u00028\u00000G8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u0011\u0010N\u001A\u00028\u00008F\u00A2\u0006\u0006\u001A\u0004\bM\u0010?R\u0011\u0010Q\u001A\u00028\u00018F\u00A2\u0006\u0006\u001A\u0004\bO\u0010PR\u0011\u0010S\u001A\u00028\u00008F\u00A2\u0006\u0006\u001A\u0004\bR\u0010?\u00A8\u0006T"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "lowerBound", "upperBound", "", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "d", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "internalState", "", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "f", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "g", "Ljava/lang/Object;", "getLowerBound", "h", "getUpperBound", "Landroidx/compose/animation/core/SpringSpec;", "j", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "getValue", "value", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,507:1\n81#2:508\n107#2,2:509\n81#2:511\n107#2,2:512\n1#3:514\n54#4,7:515\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n98#1:508\n98#1:509,2\n105#1:511\n105#1:512,2\n179#1:515,7\n*E\n"})
public final class Animatable {
    public static final int $stable = 8;
    public final TwoWayConverter a;
    public final Object b;
    public final String c;
    public final AnimationState d;
    public final MutableState e;
    public final MutableState f;
    public Object g;
    public Object h;
    public final MutatorMutex i;
    public final SpringSpec j;
    public final AnimationVector k;
    public final AnimationVector l;
    public AnimationVector m;
    public AnimationVector n;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public Animatable(Object object0, TwoWayConverter twoWayConverter0, Object object1) {
        this(object0, twoWayConverter0, object1, "Animatable");
    }

    public Animatable(Object object0, TwoWayConverter twoWayConverter0, Object object1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            object1 = null;
        }
        this(object0, twoWayConverter0, object1);
    }

    public Animatable(Object object0, @NotNull TwoWayConverter twoWayConverter0, @Nullable Object object1, @NotNull String s) {
        AnimationVector1D animationVector1D1;
        AnimationVector1D animationVector1D0;
        this.a = twoWayConverter0;
        this.b = object1;
        this.c = s;
        this.d = new AnimationState(twoWayConverter0, object0, null, 0L, 0L, false, 60, null);
        this.e = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.i = new MutatorMutex();
        this.j = new SpringSpec(0.0f, 0.0f, object1, 3, null);
        AnimationVector animationVector0 = this.getVelocityVector();
        if(animationVector0 instanceof AnimationVector1D) {
            animationVector1D0 = AnimatableKt.e;
        }
        else if(animationVector0 instanceof AnimationVector2D) {
            animationVector1D0 = AnimatableKt.f;
        }
        else if(animationVector0 instanceof AnimationVector3D) {
            animationVector1D0 = AnimatableKt.g;
        }
        else {
            animationVector1D0 = AnimatableKt.h;
        }
        Intrinsics.checkNotNull(animationVector1D0, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.k = animationVector1D0;
        AnimationVector animationVector1 = this.getVelocityVector();
        if(animationVector1 instanceof AnimationVector1D) {
            animationVector1D1 = AnimatableKt.a;
        }
        else if(animationVector1 instanceof AnimationVector2D) {
            animationVector1D1 = AnimatableKt.b;
        }
        else if(animationVector1 instanceof AnimationVector3D) {
            animationVector1D1 = AnimatableKt.c;
        }
        else {
            animationVector1D1 = AnimatableKt.d;
        }
        Intrinsics.checkNotNull(animationVector1D1, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.l = animationVector1D1;
        this.m = animationVector1D0;
        this.n = animationVector1D1;
    }

    public Animatable(Object object0, TwoWayConverter twoWayConverter0, Object object1, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            object1 = null;
        }
        if((v & 8) != 0) {
            s = "Animatable";
        }
        this(object0, twoWayConverter0, object1, s);
    }

    public final Object a(Object object0) {
        if(Intrinsics.areEqual(this.m, this.k) && Intrinsics.areEqual(this.n, this.l)) {
            return object0;
        }
        TwoWayConverter twoWayConverter0 = this.a;
        AnimationVector animationVector0 = (AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0);
        int v = animationVector0.getSize$animation_core_release();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(animationVector0.get$animation_core_release(v1) < this.m.get$animation_core_release(v1) || animationVector0.get$animation_core_release(v1) > this.n.get$animation_core_release(v1)) {
                animationVector0.set$animation_core_release(v1, c.coerceIn(animationVector0.get$animation_core_release(v1), this.m.get$animation_core_release(v1), this.n.get$animation_core_release(v1)));
                z = true;
            }
        }
        return z ? twoWayConverter0.getConvertFromVector().invoke(animationVector0) : object0;
    }

    public static final void access$endAnimation(Animatable animatable0) {
        animatable0.d.getVelocityVector().reset$animation_core_release();
        animatable0.d.setLastFrameTimeNanos$animation_core_release(0x8000000000000000L);
        animatable0.e.setValue(Boolean.FALSE);
    }

    public static final Object access$runAnimation(Animatable animatable0, Animation animation0, Object object0, Function1 function10, Continuation continuation0) {
        return animatable0.b(animation0, object0, function10, continuation0);
    }

    public static final void access$setRunning(Animatable animatable0, boolean z) {
        animatable0.e.setValue(Boolean.valueOf(z));
    }

    public static final void access$setTargetValue(Animatable animatable0, Object object0) {
        animatable0.f.setValue(object0);
    }

    @Nullable
    public final Object animateDecay(Object object0, @NotNull DecayAnimationSpec decayAnimationSpec0, @Nullable Function1 function10, @NotNull Continuation continuation0) {
        Object object1 = this.getValue();
        AnimationVector animationVector0 = (AnimationVector)this.a.getConvertToVector().invoke(object0);
        return this.b(new DecayAnimation(decayAnimationSpec0, this.a, object1, animationVector0), object0, function10, continuation0);
    }

    public static Object animateDecay$default(Animatable animatable0, Object object0, DecayAnimationSpec decayAnimationSpec0, Function1 function10, Continuation continuation0, int v, Object object1) {
        if((v & 4) != 0) {
            function10 = null;
        }
        return animatable0.animateDecay(object0, decayAnimationSpec0, function10, continuation0);
    }

    @Nullable
    public final Object animateTo(Object object0, @NotNull AnimationSpec animationSpec0, Object object1, @Nullable Function1 function10, @NotNull Continuation continuation0) {
        Object object2 = this.getValue();
        return this.b(AnimationKt.TargetBasedAnimation(animationSpec0, this.a, object2, object0, object1), object1, function10, continuation0);
    }

    public static Object animateTo$default(Animatable animatable0, Object object0, AnimationSpec animationSpec0, Object object1, Function1 function10, Continuation continuation0, int v, Object object2) {
        if((v & 2) != 0) {
            animationSpec0 = animatable0.j;
        }
        if((v & 4) != 0) {
            object1 = animatable0.getVelocity();
        }
        if((v & 8) != 0) {
            function10 = null;
        }
        return animatable0.animateTo(object0, animationSpec0, object1, function10, continuation0);
    }

    @NotNull
    public final State asState() {
        return this.d;
    }

    public final Object b(Animation animation0, Object object0, Function1 function10, Continuation continuation0) {
        b b0 = new b(this, object0, animation0, this.d.getLastFrameTimeNanos(), function10, null);
        return MutatorMutex.mutate$default(this.i, null, b0, continuation0, 1, null);
    }

    @NotNull
    public final SpringSpec getDefaultSpringSpec$animation_core_release() {
        return this.j;
    }

    @NotNull
    public final AnimationState getInternalState$animation_core_release() {
        return this.d;
    }

    @NotNull
    public final String getLabel() {
        return this.c;
    }

    @Nullable
    public final Object getLowerBound() {
        return this.g;
    }

    public final Object getTargetValue() {
        return this.f.getValue();
    }

    @NotNull
    public final TwoWayConverter getTypeConverter() {
        return this.a;
    }

    @Nullable
    public final Object getUpperBound() {
        return this.h;
    }

    public final Object getValue() {
        return this.d.getValue();
    }

    public final Object getVelocity() {
        return this.a.getConvertFromVector().invoke(this.getVelocityVector());
    }

    @NotNull
    public final AnimationVector getVelocityVector() {
        return this.d.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(Object object0, @NotNull Continuation continuation0) {
        t.c c0 = new t.c(this, object0, null);
        Object object1 = MutatorMutex.mutate$default(this.i, null, c0, continuation0, 1, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Nullable
    public final Object stop(@NotNull Continuation continuation0) {
        d d0 = new d(this, null);
        Object object0 = MutatorMutex.mutate$default(this.i, null, d0, continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void updateBounds(@Nullable Object object0, @Nullable Object object1) {
        AnimationVector animationVector1;
        AnimationVector animationVector0;
        TwoWayConverter twoWayConverter0 = this.a;
        if(object0 == null) {
            animationVector0 = this.k;
        }
        else {
            animationVector0 = (AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0);
            if(animationVector0 == null) {
                animationVector0 = this.k;
            }
        }
        if(object1 == null) {
            animationVector1 = this.l;
        }
        else {
            animationVector1 = (AnimationVector)twoWayConverter0.getConvertToVector().invoke(object1);
            if(animationVector1 == null) {
                animationVector1 = this.l;
            }
        }
        int v = animationVector0.getSize$animation_core_release();
        for(int v1 = 0; v1 < v; ++v1) {
            if(animationVector0.get$animation_core_release(v1) > animationVector1.get$animation_core_release(v1)) {
                PreconditionsKt.throwIllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + animationVector0 + " is greater than upper bound " + animationVector1 + " on index " + v1));
            }
        }
        this.m = animationVector0;
        this.n = animationVector1;
        this.h = object1;
        this.g = object0;
        if(!this.isRunning()) {
            Object object2 = this.a(this.getValue());
            if(!Intrinsics.areEqual(object2, this.getValue())) {
                this.d.setValue$animation_core_release(object2);
            }
        }
    }

    public static void updateBounds$default(Animatable animatable0, Object object0, Object object1, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = animatable0.g;
        }
        if((v & 2) != 0) {
            object1 = animatable0.h;
        }
        animatable0.updateBounds(object0, object1);
    }
}

