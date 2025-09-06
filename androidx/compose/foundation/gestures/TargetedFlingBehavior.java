package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0006J.\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00032\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH¦@¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "performFling", "", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRemainingDistanceUpdated", "Lkotlin/Function1;", "", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TargetedFlingBehavior extends FlingBehavior {
    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    default Object performFling(@NotNull ScrollScope scrollScope0, float f, @NotNull Continuation continuation0) {
        return TargetedFlingBehavior.performFling$suspendImpl(this, scrollScope0, f, continuation0);
    }

    @Nullable
    Object performFling(@NotNull ScrollScope arg1, float arg2, @NotNull Function1 arg3, @NotNull Continuation arg4);

    static Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior0, ScrollScope scrollScope0, float f, Continuation continuation0) {
        return targetedFlingBehavior0.performFling(scrollScope0, f, TargetedFlingBehaviorKt.a, continuation0);
    }
}

