package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.d0;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001C\u0010\u000B\u001A\u00020\u0003*\u00020\t2\u0006\u0010\n\u001A\u00020\u0003H\u0096@¢\u0006\u0004\b\u000B\u0010\fR(\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001A\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "flingDecay", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingDecay", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "setFlingDecay", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "", "c", "I", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultFlingBehavior implements FlingBehavior {
    public static final int $stable;
    public DecayAnimationSpec a;
    public final MotionDurationScale b;
    public int c;

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull MotionDurationScale motionDurationScale0) {
        this.a = decayAnimationSpec0;
        this.b = motionDurationScale0;
    }

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec0, MotionDurationScale motionDurationScale0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            motionDurationScale0 = ScrollableKt.getDefaultScrollMotionDurationScale();
        }
        this(decayAnimationSpec0, motionDurationScale0);
    }

    @NotNull
    public final DecayAnimationSpec getFlingDecay() {
        return this.a;
    }

    public final int getLastAnimationCycleCount() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope0, float f, @NotNull Continuation continuation0) {
        this.c = 0;
        d0 d00 = new d0(f, this, scrollScope0, null);
        return BuildersKt.withContext(this.b, d00, continuation0);
    }

    public final void setFlingDecay(@NotNull DecayAnimationSpec decayAnimationSpec0) {
        this.a = decayAnimationSpec0;
    }

    public final void setLastAnimationCycleCount(int v) {
        this.c = v;
    }
}

