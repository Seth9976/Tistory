package androidx.compose.material3.pulltorefresh;

import androidx.annotation.FloatRange;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000E\u0010\t\u001A\u00020\nH¦@¢\u0006\u0002\u0010\u000BJ\u000E\u0010\f\u001A\u00020\nH¦@¢\u0006\u0002\u0010\u000BJ\u0018\u0010\r\u001A\u00020\n2\b\b\u0001\u0010\u000E\u001A\u00020\u0003H¦@¢\u0006\u0002\u0010\u000FR\u0014\u0010\u0002\u001A\u00020\u00038gX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "distanceFraction", "", "getDistanceFraction", "()F", "isAnimating", "", "()Z", "animateToHidden", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToThreshold", "snapTo", "targetValue", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PullToRefreshState {
    @Nullable
    Object animateToHidden(@NotNull Continuation arg1);

    @Nullable
    Object animateToThreshold(@NotNull Continuation arg1);

    @FloatRange(from = 0.0)
    float getDistanceFraction();

    default boolean isAnimating() {
        return false;
    }

    @Nullable
    Object snapTo(@FloatRange(from = 0.0) float arg1, @NotNull Continuation arg2);
}

