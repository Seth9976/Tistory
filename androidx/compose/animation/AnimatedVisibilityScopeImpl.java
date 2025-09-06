package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\u0006R \u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "<init>", "(Landroidx/compose/animation/core/Transition;)V", "a", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "b", "Landroidx/compose/runtime/MutableState;", "getTargetSize$animation_release", "()Landroidx/compose/runtime/MutableState;", "targetSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    public static final int $stable = 8;
    public Transition a;
    public final MutableState b;

    public AnimatedVisibilityScopeImpl(@NotNull Transition transition0) {
        this.a = transition0;
        this.b = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(0L), null, 2, null);
    }

    @NotNull
    public final MutableState getTargetSize$animation_release() {
        return this.b;
    }

    @Override  // androidx.compose.animation.AnimatedVisibilityScope
    @NotNull
    public Transition getTransition() {
        return this.a;
    }

    public void setTransition(@NotNull Transition transition0) {
        this.a = transition0;
    }
}

