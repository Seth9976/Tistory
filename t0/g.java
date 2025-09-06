package t0;

import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class g extends AdaptedFunctionReference implements SuspendFunction, Function2 {
    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return PullRefreshKt.access$pullRefresh$lambda$1$onRelease(((PullRefreshState)this.receiver), ((Number)object0).floatValue(), ((Continuation)object1));
    }
}

