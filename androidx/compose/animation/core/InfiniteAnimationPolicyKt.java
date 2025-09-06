package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A9\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012#\b\u0004\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086H¢\u0006\u0002\u0010\b\u001A7\u0010\t\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012!\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@¢\u0006\u0002\u0010\b¨\u0006\u000B"}, d2 = {"withInfiniteAnimationFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withInfiniteAnimationFrameNanos", "frameTimeNanos", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InfiniteAnimationPolicyKt {
    @Nullable
    public static final Object withInfiniteAnimationFrameMillis(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new Function1(function10) {
            public final Function1 w;

            {
                this.w = function10;
                super(1);
            }

            public final Object invoke(long v) {
                return this.w.invoke(((long)(v / 1000000L)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).longValue());
            }
        }, continuation0);
    }

    @Nullable
    public static final Object withInfiniteAnimationFrameNanos(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        InfiniteAnimationPolicy infiniteAnimationPolicy0 = (InfiniteAnimationPolicy)continuation0.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy0 == null ? MonotonicFrameClockKt.withFrameNanos(function10, continuation0) : infiniteAnimationPolicy0.onInfiniteOperation(new k(function10, null), continuation0);
    }
}

