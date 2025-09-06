package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001D\u0010\b\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H ¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\u000B\u001A\u00020\u0005H ¢\u0006\u0004\b\t\u0010\nR+\u0010\u0014\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u00008&@`X¦\u000E¢\u0006\f\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001C\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u00008&@`X¦\u000E¢\u0006\f\u001A\u0004\b\u001A\u0010\u0016\"\u0004\b\u001B\u0010\u0018\u0082\u0001\u0002\u001D\u001E¨\u0006\u001F"}, d2 = {"Landroidx/compose/animation/core/TransitionState;", "S", "", "Landroidx/compose/animation/core/Transition;", "transition", "", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "transitionRemoved$animation_core_release", "()V", "transitionRemoved", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "isRunning$animation_core_release", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "(Ljava/lang/Object;)V", "currentState", "getTargetState", "setTargetState$animation_core_release", "targetState", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/SeekableTransitionState;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n125#1:2184\n125#1:2185,2\n*E\n"})
public abstract class TransitionState {
    public static final int $stable;
    public final MutableState a;

    public TransitionState(DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public abstract Object getCurrentState();

    public abstract Object getTargetState();

    public final boolean isRunning$animation_core_release() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    public abstract void setCurrentState$animation_core_release(Object arg1);

    public final void setRunning$animation_core_release(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public abstract void setTargetState$animation_core_release(Object arg1);

    public abstract void transitionConfigured$animation_core_release(@NotNull Transition arg1);

    public abstract void transitionRemoved$animation_core_release();
}

