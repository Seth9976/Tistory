package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u000B\u001A\u00020\b2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000E\u001A\u00020\bH\u0010¢\u0006\u0004\b\f\u0010\rR+\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u00008V@PX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R+\u0010\u0019\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u00008V@VX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0005R\u0011\u0010\u001B\u001A\u00020\u001A8F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition;", "transition", "", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "transitionRemoved$animation_core_release", "()V", "transitionRemoved", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "currentState", "c", "getTargetState", "setTargetState", "targetState", "", "isIdle", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n81#2:2187\n107#2,2:2188\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n171#1:2184\n171#1:2185,2\n183#1:2187\n183#1:2188,2\n*E\n"})
public final class MutableTransitionState extends TransitionState {
    public static final int $stable;
    public final MutableState b;
    public final MutableState c;

    public MutableTransitionState(Object object0) {
        super(null);
        this.b = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public Object getCurrentState() {
        return this.b.getValue();
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public Object getTargetState() {
        return this.c.getValue();
    }

    // 去混淆评级： 低(20)
    public final boolean isIdle() {
        return Intrinsics.areEqual(this.getCurrentState(), this.getTargetState()) && !this.isRunning$animation_core_release();
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(Object object0) {
        this.b.setValue(object0);
    }

    public void setTargetState(Object object0) {
        this.c.setValue(object0);
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(Object object0) {
        this.setTargetState(object0);
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@NotNull Transition transition0) {
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
    }
}

