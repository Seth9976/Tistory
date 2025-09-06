package androidx.compose.animation;

import aa.r;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.w;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001C\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ3\u0010\u0010\u001A\u00020\u000F2\u001C\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\b\u00A2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DRW\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\u001C\u0010\u001E\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00048F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010,\u001A\b\u0012\u0004\u0012\u00020\b0%8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R;\u00103\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010-2\u000E\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010-8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b.\u0010 \u001A\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00104\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b4\u00105R\u0013\u00108\u001A\u0004\u0018\u00010\b8F\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u0011\u0010:\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b9\u00105\u00A8\u0006;"}, d2 = {"Landroidx/compose/animation/BoundsAnimation;", "", "Landroidx/compose/animation/SharedTransitionScope;", "transitionScope", "Landroidx/compose/animation/core/Transition;", "", "transition", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "animation", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "<init>", "(Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V", "", "updateAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V", "currentBounds", "targetBounds", "animate", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "a", "Landroidx/compose/animation/SharedTransitionScope;", "getTransitionScope", "()Landroidx/compose/animation/SharedTransitionScope;", "b", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "e", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animationSpec", "Landroidx/compose/runtime/State;", "f", "getAnimationState", "()Landroidx/compose/runtime/State;", "setAnimationState", "(Landroidx/compose/runtime/State;)V", "animationState", "isRunning", "()Z", "getValue", "()Landroidx/compose/ui/geometry/Rect;", "value", "getTarget", "target", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBoundsAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n81#2:103\n107#2,2:104\n81#2:106\n107#2,2:107\n81#2:109\n107#2,2:110\n*S KotlinDebug\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n*L\n39#1:103\n39#1:104,2\n54#1:106\n54#1:107,2\n69#1:109\n69#1:110,2\n*E\n"})
public final class BoundsAnimation {
    public static final int $stable = 8;
    public final SharedTransitionScope a;
    public final Transition b;
    public final MutableState c;
    public final MutableState d;
    public FiniteAnimationSpec e;
    public final MutableState f;

    public BoundsAnimation(@NotNull SharedTransitionScope sharedTransitionScope0, @NotNull Transition transition0, @NotNull DeferredAnimation transition$DeferredAnimation0, @NotNull BoundsTransform boundsTransform0) {
        this.a = sharedTransitionScope0;
        this.b = transition0;
        this.c = SnapshotStateKt.mutableStateOf$default(transition$DeferredAnimation0, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(boundsTransform0, null, 2, null);
        this.e = BoundsAnimationKt.a;
        this.f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final void animate(@NotNull Rect rect0, @NotNull Rect rect1) {
        if(this.a.isTransitionActive()) {
            if(this.getAnimationState() == null) {
                this.e = ((BoundsTransform)this.d.getValue()).transform(rect0, rect1);
            }
            this.setAnimationState(this.getAnimation().animate(new w(this), new r(this, rect1, 21, rect0)));
        }
    }

    @NotNull
    public final DeferredAnimation getAnimation() {
        return (DeferredAnimation)this.c.getValue();
    }

    @NotNull
    public final FiniteAnimationSpec getAnimationSpec() {
        return this.e;
    }

    @Nullable
    public final State getAnimationState() {
        return (State)this.f.getValue();
    }

    public final boolean getTarget() {
        return ((Boolean)this.b.getTargetState()).booleanValue();
    }

    @NotNull
    public final Transition getTransition() {
        return this.b;
    }

    @NotNull
    public final SharedTransitionScope getTransitionScope() {
        return this.a;
    }

    @Nullable
    public final Rect getValue() {
        if(this.a.isTransitionActive()) {
            State state0 = this.getAnimationState();
            return state0 == null ? null : ((Rect)state0.getValue());
        }
        return null;
    }

    public final boolean isRunning() {
        Transition transition0 = this.b;
        while(transition0.getParentTransition() != null) {
            transition0 = transition0.getParentTransition();
            Intrinsics.checkNotNull(transition0);
        }
        return !Intrinsics.areEqual(transition0.getCurrentState(), transition0.getTargetState());
    }

    public final void setAnimationSpec(@NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        this.e = finiteAnimationSpec0;
    }

    public final void setAnimationState(@Nullable State state0) {
        this.f.setValue(state0);
    }

    public final void updateAnimation(@NotNull DeferredAnimation transition$DeferredAnimation0, @NotNull BoundsTransform boundsTransform0) {
        if(!Intrinsics.areEqual(this.getAnimation(), transition$DeferredAnimation0)) {
            this.c.setValue(transition$DeferredAnimation0);
            this.setAnimationState(null);
            this.e = BoundsAnimationKt.a;
        }
        this.d.setValue(boundsTransform0);
    }
}

