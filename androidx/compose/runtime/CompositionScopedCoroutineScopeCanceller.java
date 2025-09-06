package androidx.compose.runtime;

import androidx.compose.foundation.layout.b4;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000F\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "a", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    public final CoroutineScope a;

    public CompositionScopedCoroutineScopeCanceller(@NotNull CoroutineScope coroutineScope0) {
        this.a = coroutineScope0;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        b4 b40 = new b4(5);
        CoroutineScopeKt.cancel(this.a, b40);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        b4 b40 = new b4(5);
        CoroutineScopeKt.cancel(this.a, b40);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}

